package singletonTest;

import com.gupaoedu.pattern.singleton.register.EnumSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest {
    public static void main(String[] args) {
//        EnumSingleton instance1 = null;
//        EnumSingleton instance2 = EnumSingleton.getInstance();
//        instance2.setData(new Object());
//
//        try {
//            FileOutputStream fos = new FileOutputStream(new File("EnumSingleton.obj"));
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(instance2);
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            instance1 = (EnumSingleton) ois.readObject();
//            System.out.println(instance1.getData());
//            System.out.println(instance2.getData());
//            System.out.println(instance1.getData() == instance2.getData());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Class<?> clazz = EnumSingleton.class;
        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);
            EnumSingleton e = (EnumSingleton) constructor.newInstance("cx",888);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
