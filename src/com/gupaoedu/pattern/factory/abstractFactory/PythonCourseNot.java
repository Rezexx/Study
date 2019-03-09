package com.gupaoedu.pattern.factory.abstractFactory;

public class PythonCourseNot implements INote {
    @Override
    public void write() {
        System.out.println("Python笔记");
    }
}
