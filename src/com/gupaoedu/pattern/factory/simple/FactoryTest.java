package com.gupaoedu.pattern.factory.simple;

public class FactoryTest {
    public static void main(String[] args) {

        CourseFactory courseFactory = new CourseFactory();
        ICourse javaCourse = courseFactory.create("Java");
        System.out.println(javaCourse);
        javaCourse = courseFactory.create("Python");
        System.out.println(javaCourse);

    }
}
