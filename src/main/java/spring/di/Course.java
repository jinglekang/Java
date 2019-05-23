package spring.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("course")
public class Course {

    @Value("英语课")
    private String courseName;

    @Value("15")
    private int courseHour;

    @Resource(name = "teacher") // 利用javax本身的注解实现，spring对其实现了支持
    private Teacher teacher;

    public Course() {
    }

    public Course(String courseName, int courseHour, Teacher teacher) {
        this.courseName = courseName;
        this.courseHour = courseHour;
        this.teacher = teacher;
    }

    public Course( Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(int courseHour) {
        this.courseHour = courseHour;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String showInfo() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseHour=" + courseHour +
                ", teacher=" + teacher.getName() +
                '}';
    }
}
