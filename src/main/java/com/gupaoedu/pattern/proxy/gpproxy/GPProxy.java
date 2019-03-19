package com.gupaoedu.pattern.proxy.gpproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.Tool;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GPProxy {
    public static final String ln = "\r\n";
    public final static Object newProxyInstance(GPClassLoader classLoader,Class<?>[] interfaces,GPInvocationHandler h) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //动态生成源代码.java文件
        String src = generateSrc(interfaces);
        //生成新的Proxy.java文件输出磁盘
        String filePath = GPProxy.class.getResource("").getPath();
        System.out.println(filePath);
        File file = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(file);
        fw.write(src);
        fw.flush();
        fw.close();
        //将java文件编译成.class文件
        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager standardJavaFileManager = javaCompiler.getStandardFileManager(null,null,null);
        Iterable iterable = standardJavaFileManager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask task = javaCompiler.getTask(null,standardJavaFileManager,null,null,null,iterable);
        task.call();
        standardJavaFileManager.close();
        //将编译的.class文件加载到JVM中来
        Class proxyClass = classLoader.findClass("$Proxy0");
        Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
        file.delete();
        //返回字节码重组之后的新代理对象
        return c.newInstance(h);
    }

    private static String generateSrc(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupaoedu.pattern.proxy.gpproxy;" + ln);
        sb.append("import com.gupaoedu.pattern.proxy.dynamicproxy.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("GPInvocationHandler h;" + ln);
        sb.append("public $Proxy0 (GPInvocationHandler h) {" + ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);
        for(Method m : interfaces[0].getMethods()) {
            sb.append("public" + " " + m.getReturnType() + " " + m.getName() + "(){" + ln);
            sb.append("try{");
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("} catch(Throwable e){");
            sb.append("e.printStackTrace();");
            sb.append("}");
            sb.append("}");
        }
        sb.append("}" + ln);

        return sb.toString();
    }
}
