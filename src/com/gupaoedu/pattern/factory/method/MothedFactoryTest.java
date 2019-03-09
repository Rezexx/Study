package com.gupaoedu.pattern.factory.method;

import com.gupaoedu.pattern.factory.simple.ICourse;
import com.gupaoedu.pattern.factory.simple.JavaCourse;

public class MothedFactoryTest {
    public static void main(String[] args) {
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse javaCourse = javaCourseFactory.createCourse();
        System.out.println(javaCourse);
    }
}
