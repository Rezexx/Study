package factoryTest;

import com.gupaoedu.pattern.factory.abstractFactory.*;
import com.gupaoedu.pattern.factory.simple.JavaCourse;
import org.omg.PortableInterceptor.INACTIVE;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        INote javaNote = javaCourseFactory.createNote();
        IVideo javaVideo = javaCourseFactory.createVideo();
        System.out.println(javaNote+","+javaVideo);

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        INote pythonNote = pythonCourseFactory.createNote();
        IVideo pythonVideo = pythonCourseFactory.createVideo();
        System.out.println(pythonNote+","+pythonVideo);
    }
}
