package base.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 登录页布局演示
 */
public class Demo_LoginSystem extends JFrame {
    public Demo_LoginSystem() {

        // 定义三个面板
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        // 登陆按钮和取消按钮
        JButton jok = new JButton("登陆");
        JButton jcancen = new JButton("取消");

        // 用户名输入框和密码输入框
        JTextField jun = new JTextField(20);
        JPasswordField jpw = new JPasswordField(20);

        // 两个标签
        JLabel lun = new JLabel("登录名：");
        JLabel lpw = new JLabel("密　码：");

        this.setLayout(new GridLayout(3,1));

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        jp1.add(lun);
        jp1.add(jun);

        jp2.add(lpw);
        jp2.add(jpw);

        jp3.add(jok);
        jp3.add(jcancen);

        this.setTitle("登陆系统演示");
        this.setSize(400, 130);
        // 禁止用户改变窗体
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_LoginSystem dls = new Demo_LoginSystem();
    }
}
