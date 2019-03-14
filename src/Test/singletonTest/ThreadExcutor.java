package singletonTest;

import com.gupaoedu.pattern.singleton.hungry.HungrySingleton;
import com.gupaoedu.pattern.singleton.lazy.LazySingleton;
import com.gupaoedu.pattern.singleton.localthread.ThreadLocalSingleton;

public class ThreadExcutor implements Runnable{
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(System.currentTimeMillis()+":"+lazySingleton);
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
