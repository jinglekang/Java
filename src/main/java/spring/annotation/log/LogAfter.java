package spring.annotation.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component("logAfter")
public class LogAfter implements AfterReturningAdvice {
    public void afterReturning(Object o1, Method method, Object[] objects, Object o2) throws Throwable {
        System.out.println("后置通知");
    }
}