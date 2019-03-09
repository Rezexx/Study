package com.gupaoedu.pattern.factory.abstractFactory;

public class PythonCourseVideo implements IVideo{
    @Override
    public void replay() {
        System.out.println("播放Python录像");
    }
}
