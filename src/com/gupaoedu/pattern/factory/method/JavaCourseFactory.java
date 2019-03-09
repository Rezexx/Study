package com.gupaoedu.pattern.factory.method;

import com.gupaoedu.pattern.factory.simple.ICourse;
import com.gupaoedu.pattern.factory.simple.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
