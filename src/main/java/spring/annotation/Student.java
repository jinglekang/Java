package spring.annotation;

import org.springframework.stereotype.Component;
import spring.SpringUtils;
import spring.annotation.service.StudentService;

@Component("annotationStudent")
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        StudentService service = SpringUtils.getBean("studentService");
        service.addStudent(student);
    }
}
