package com.gupaoedu.pattern.singleton.lazy;

public class LazyInnerSingleton {
    private LazyInnerSingleton(){}
    public static LazyInnerSingleton getInstance(){
        //防止反射破坏单例，抛出异常
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不许创建多个实例");
        }
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerSingleton LAZY = new LazyInnerSingleton();
    }

    private LazyInnerSingleton readResolve(){
        return LazyHolder.LAZY;
    }

}
