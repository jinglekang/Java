package spring.annotation.log;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

@Component("logException")
public class LogException implements ThrowsAdvice {
    public void afterThrowing(Exception ex) {
        System.out.println("异常通知");
    }

}
