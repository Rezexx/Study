package singletonTest;

import com.gupaoedu.pattern.singleton.hungry.HungrySingleton;

public class HungrySingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadExcutor());
        Thread thread2 = new Thread(new ThreadExcutor());
        thread1.start();
        thread2.start();
        System.out.println("End");
    }
}
