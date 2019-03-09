package com.gupaoedu.pattern.factory.abstractFactory;

public class JavaCourseVideo implements IVideo{
    @Override
    public void replay() {
        System.out.println("播放Java录像");
    }
}
