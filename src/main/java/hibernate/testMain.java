package hibernate;


import hibernate.model.Student;
import hibernate.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testMain {

    private SessionFactory factory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        // 读取配置文件hibernate.cfg.xml
        Configuration configure = new Configuration().configure();
        // 根据配置文件注册服务类
        ServiceRegistry registry = configure.getStandardServiceRegistryBuilder().build();
        // 从服务类中创建SessionFactory工厂类
        factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        // 开启Session对象
        session = factory.openSession();
        // 开始事务处理
        transaction = session.beginTransaction();
    }

    @After
    public void destroy() {
        // 提交事务
        transaction.commit();
        // 关闭session会话
        session.close();
        // 关闭session工厂
        factory.close();
    }

    @Test
    public void test() {
        // 创建学生类
        // StudentDao student = new StudentDao("张三", "男", System.currentTimeMillis());
        Users user = new Users("张三","123456");
        // 执行保存操作
        session.save(user);

        Users users = new Users();
        users.setId(2);

        Student student = new Student();
        student.setName("张三");
        student.setGender("男");
        student.setCreateDate(System.currentTimeMillis());


    }
}
