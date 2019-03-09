package com.gupaoedu.pattern.factory.simple;

import javax.swing.*;

public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录播Java课程");
    }
}
