package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        return (T) context.getBean(name);
    }
}
