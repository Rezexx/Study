package com.gupaoedu.pattern.proxy.gpproxy;

import com.gupaoedu.pattern.proxy.dynamicproxy.Person;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GPMeiPo implements GPInvocationHandler {
    //把被代理对象引用保存起来
    private Person target;

    public Object getInstance(Person target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        before();
        Object obj = null;
        try {
            obj = method.invoke(this.target,args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        after();
        return obj;
    }

    private void before (){
        System.out.println("method before invoke");
    }

    private void after(){
        System.out.println("method after invoke");
    }
}
