package com.gupaoedu.pattern.factory.abstractFactory;

public class JavaCourseFactory implements CourseFactory{
    @Override
    public INote createNote() {
        return new JavaCourseNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaCourseVideo();
    }
}
