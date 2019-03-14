package com.gupaoedu.pattern.singleton.lazy;


//懒汉式
//非线程安全## 加上synchronized关键字线程安全
//需要用到时才加载
public class LazyDoubleCheckSingleton {
    public static LazyDoubleCheckSingleton lazy = null;
    private LazyDoubleCheckSingleton(){}
    public static final LazyDoubleCheckSingleton getInstance(){
            if(lazy == null){
                synchronized(LazyDoubleCheckSingleton.class){
                    if(lazy == null){
                        lazy = new LazyDoubleCheckSingleton();
                    }
                }
            }
        return lazy;
    }
}
