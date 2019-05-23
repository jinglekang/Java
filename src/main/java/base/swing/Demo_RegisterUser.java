package base.swing;

import javax.swing.*;
import java.awt.*;

public class Demo_RegisterUser extends JFrame {
    public Demo_RegisterUser() {

        // 定义三个组件
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        // 按钮组
        ButtonGroup bg1 = new ButtonGroup();

        // 两个文字标签
        JLabel jl1 = new JLabel("你喜欢的运动：");
        JLabel jl2 = new JLabel("你的性别：");


        // 三个复选框
        JCheckBox jcb1 = new JCheckBox("篮球");
        JCheckBox jcb2 = new JCheckBox("足球");
        JCheckBox jcb3 = new JCheckBox("网球");

        // 两个单选按钮
        JRadioButton jrb1 = new JRadioButton("男");
        JRadioButton jrb2 = new JRadioButton("女");

        // 两个按钮
        JButton jb1 = new JButton("注册用户");
        JButton jb2 = new JButton("取消注册");


        jp1.add(jl1);
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jcb3);
        jp2.add(jl2);
        bg1.add(jrb1);
        bg1.add(jrb2);
        jp2.add(jrb1);
        jp2.add(jrb2);
        jp3.add(jb1);
        jp3.add(jb2);
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.setTitle("用户注册演示");
        this.setSize(300, 150);
        this.setLayout(new GridLayout(3, 1));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        Demo_RegisterUser dru = new Demo_RegisterUser();
    }
}
