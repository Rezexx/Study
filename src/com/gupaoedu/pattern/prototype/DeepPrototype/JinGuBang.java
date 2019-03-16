package com.gupaoedu.pattern.prototype.DeepPrototype;

import java.io.Serializable;

public class JinGuBang implements Serializable {
    public float h;
    public float d;

    public void big(){
        this.h *= 2;
        this.d *= 2;
    }

    public void small(){
        this.h /= 2;
        this.d /=2;
    }
}
