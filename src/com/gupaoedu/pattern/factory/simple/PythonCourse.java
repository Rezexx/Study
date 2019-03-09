package com.gupaoedu.pattern.factory.simple;

public class PythonCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录播python课程");
    }
}
