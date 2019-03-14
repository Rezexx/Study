package com.gupaoedu.pattern.singleton.hungry;

//饿汉式
//类加载时创建对象
//线程安全
public class HungrySingleton {
    private static final HungrySingleton hungry = new HungrySingleton();
    private HungrySingleton(){}
    public static final HungrySingleton getInstance (){
        return hungry;
    }
}
