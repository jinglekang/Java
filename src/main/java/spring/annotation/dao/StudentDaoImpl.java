package spring.annotation.dao;

import org.springframework.stereotype.Repository;
import spring.annotation.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    public void addStudent(Student student) {
        System.out.println("增加了一个学生");
        // Object o = new JSONObject().get("123");
        // System.out.println(o.toString());
    }
}
