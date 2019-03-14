package singletonTest;

import com.gupaoedu.pattern.singleton.localthread.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ThreadExcutor());
        Thread t2 = new Thread(new ThreadExcutor());
        t1.start();
        t2.start();
        System.out.println("End");

    }
}
