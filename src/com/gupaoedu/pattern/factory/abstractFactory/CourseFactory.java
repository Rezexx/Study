package com.gupaoedu.pattern.factory.abstractFactory;

public interface CourseFactory {
    public INote createNote();
    public IVideo createVideo();
}
