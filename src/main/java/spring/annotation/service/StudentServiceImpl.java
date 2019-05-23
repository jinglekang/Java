package spring.annotation.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.annotation.Student;
import spring.annotation.dao.StudentDao;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    // @Autowired // 自动装配，byType
    // @Qualifier("studentDao") // 非必须，byId
    private StudentDao studentDao;

    public StudentServiceImpl( @Qualifier("studentDao") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    // @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public boolean addStudent(Student student) {
        studentDao = null;
        studentDao.addStudent(student);
        int a = 2/0;
        return true;
    }
}
