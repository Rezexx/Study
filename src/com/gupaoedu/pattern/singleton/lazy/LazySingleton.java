package com.gupaoedu.pattern.singleton.lazy;


//懒汉式
//非线程安全## 加上synchronized关键字线程安全
//需要用到时才加载
public class LazySingleton {
    public static LazySingleton lazy = null;
    private LazySingleton(){}
    public synchronized static final LazySingleton getInstance(){
        if(lazy == null){
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
