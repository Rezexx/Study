package com.gupaoedu.pattern.factory.abstractFactory;

import com.gupaoedu.pattern.factory.simple.PythonCourse;

public class PythonCourseFactory implements CourseFactory{
    @Override
    public INote createNote() {
        return new PythonCourseNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonCourseVideo();
    }
}
