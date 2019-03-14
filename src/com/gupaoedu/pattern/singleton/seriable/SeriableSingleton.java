package com.gupaoedu.pattern.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    private static final SeriableSingleton instance = new SeriableSingleton();
    private SeriableSingleton(){}
    public static final SeriableSingleton getInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
