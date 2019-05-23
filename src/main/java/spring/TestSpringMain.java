package spring;

import org.junit.Test;
import spring.course.Student;

public class TestSpringMain {

    @Test
    public void Test() {
        Student bean = (Student) SpringUtils.getBean("student");
        System.out.println(bean);
        bean.learn("htmlCourse");
        bean.learn("javaCourse");
    }
}
