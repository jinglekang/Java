package shiro;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;

import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Subject user = Utils.login("admin", "123456");
        if (user != null) {
            System.out.println("登录成功");
            System.out.println("用户名：" + user.getPrincipal());
            System.out.println("是否拥有system角色：" + user.hasRole("system"));
            List<String> list = Arrays.asList("system", "admin", "manager", "leader");
            System.out.println("是否拥有：system、admin、manager、leader角色：" + Arrays.toString(user.hasRoles(list)));
            // todo 尚未完成
            System.out.println("是否拥有eat、drink权限：" + Arrays.toString(user.isPermitted("eat", "drink")));
            try {
                // todo 尚未完成
                user.checkPermission("eat");
                System.out.println("拥有eat权限");
            } catch (AuthorizationException e) {
                System.out.println("没有eat权限");
            }
        } else {
            System.out.println("登录失败");
        }
    }
}
