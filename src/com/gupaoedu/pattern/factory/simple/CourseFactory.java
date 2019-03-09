package com.gupaoedu.pattern.factory.simple;

public class CourseFactory {

    public ICourse create(String name){
        if("Java".equals(name))
            return new JavaCourse();
        else if("Python".equals(name))
            return new PythonCourse();
        else
            return null;

    }

}
