package com.gupaoedu.pattern.factory.method;

import com.gupaoedu.pattern.factory.simple.ICourse;
import com.gupaoedu.pattern.factory.simple.PythonCourse;

public class PythonCourseFacotry implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
