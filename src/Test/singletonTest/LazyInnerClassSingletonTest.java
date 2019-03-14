package singletonTest;

import com.gupaoedu.pattern.singleton.lazy.LazyInnerSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerSingleton.class;
            Constructor m = clazz.getDeclaredConstructor(null);
            m.setAccessible(true);
            LazyInnerSingleton o1 = (LazyInnerSingleton) m.newInstance();
            LazyInnerSingleton o2 = LazyInnerSingleton.getInstance();
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
