package spring.annotation.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("logInter")
public class LogInter implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object o = null;
        try {
            System.out.println("环绕通知--前置通知");
            o = invocation.proceed();
            System.out.println("目标对象：" + invocation.getThis());
            System.out.println("方法名：" + invocation.getMethod());
            System.out.println("参数：" + Arrays.toString(invocation.getArguments()));
            System.out.println("环绕通知--后置通知:" + o);
        } catch (Exception e) {
            System.out.println("环绕通知--异常通知");
        }
        return o;
    }
}
