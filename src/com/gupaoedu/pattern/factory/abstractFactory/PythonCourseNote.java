package com.gupaoedu.pattern.factory.abstractFactory;

public class PythonCourseNote implements INote {
    @Override
    public void write() {
        System.out.println("Python笔记");
    }
}
