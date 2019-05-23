package spring;

import spring.annotation.Student;
import spring.di.Course;

public class TestMain {
    public static void main(String[] args) {
        Course course = SpringUtils.getBean("course");
        System.out.println(course.showInfo());
        // Aggregate aggregate = SpringUtils.getBean("aggregate");
        // System.out.println(aggregate.toString());

        // 注解方式
        Student student = SpringUtils.getBean("annotationStudent");
        student.setName("张三");
        System.out.println(student.getName());

    }
}