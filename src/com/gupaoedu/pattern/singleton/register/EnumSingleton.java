package com.gupaoedu.pattern.singleton.register;

import com.gupaoedu.pattern.factory.simple.ICourse;

public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
