package spring.annotation.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("logAnnotation")
@Aspect
public class LogAnnotation {

    // 前置通知
    @Before("execution(public * spring.annotation.service.StudentServiceImpl.addStudent(..))")
    public void before() {
        System.out.println("注解形式：前置通知");
    }

    // 后置通知
    @AfterReturning(pointcut = "execution(public * spring.annotation.service.StudentServiceImpl.addStudent(..))", returning = "value")
    public void after(JoinPoint jp, Object value) {
        System.out.println("注解形式：后置通知");
        System.out.println("目标对象：" + jp.getTarget());
        System.out.println("方法名：" + jp.getSignature().getName());
        System.out.println("当前对象：" + jp.getThis());
        System.out.println("参数：" + Arrays.toString(jp.getArgs()));
        System.out.println("返回值：" + value);
    }

    // 环绕通知 ProceedingJoinPoint，非JoinPoint
    @Around("execution(* addStudent(..))")
    public boolean around(ProceedingJoinPoint jp) {
        System.out.println("注解形式：环绕通知-前置");
        try {
            jp.proceed();

            System.out.println("注解形式：环绕通知-后置");

        } catch (Throwable e) {
            // System.out.println("注解形式：环绕通知-异常");
        } finally {
            System.out.println("注解形式：环绕通知-最终");
        }
        return true;


    }

    // 异常通知，不加参数捕获所有异常
    // @AfterThrowing("execution(public * StudentServiceImpl.addStudent(..))")
    // public void afterThrowing() {
    // 异常通知，捕获指定异常 // 这里不会显示，被上面的环绕通知捕获
    @AfterThrowing(pointcut = "execution(public * spring.annotation.service.StudentServiceImpl.addStudent(..))",throwing = "e")
    public void afterThrowing(JoinPoint jp,NullPointerException e) {
        System.out.println("注解形式：异常通知");
        System.out.println(e.toString());
        System.out.println(jp.getSignature().getName());
    }


    // 最终通知
    @After("execution(public * spring.annotation.service.StudentServiceImpl.addStudent(..))")
    public void after() {
        System.out.println("注解形式：最终通知");

    }
}
