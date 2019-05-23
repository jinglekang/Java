package shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class Utils {
    public static Subject login(String username, String password) {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.db.ini");
        SecurityManager sm = factory.getInstance();
        SecurityUtils.setSecurityManager(sm);
        Subject user = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            user.login(token);
            return user;
        } catch (AuthenticationException e) {
            return null;
        }
    }
}
