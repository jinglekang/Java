package base;


import java.lang.reflect.Method;

public class TestFan {
    private static final int INVOKE_TIME = 2000000000;

    private static void test01() {
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < INVOKE_TIME; i++) {
            user.getName();//直接通过对象调用getName方法
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法调用，执行20亿次，耗时：" + (endTime - startTime) + "ms");
    }

    private static void test02() throws Exception {
        User user = new User();
        Method method = User.class.getDeclaredMethod("getName");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < INVOKE_TIME; i++) {
            method.invoke(user);//通过反射调用getName方法
        }

        long endTime = System.currentTimeMillis();
        System.out.println("反射动态方法调用，执行20亿次，耗时：" + (endTime - startTime) + "ms");
    }

    private static void test03() throws Exception {
        User user = new User();
        Method method = User.class.getDeclaredMethod("getName");
        method.setAccessible(true); // 不需要执行访问安全检查
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < INVOKE_TIME; i++) {
            method.invoke(user);//通过反射调用getName方法
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射动态方法调用，跳过安全检查，执行20亿次，耗时：" + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) throws Exception {
        test01();
        test02();
        test03();
    }
}

class User {

    public String getName() {
        return "";
    }
}