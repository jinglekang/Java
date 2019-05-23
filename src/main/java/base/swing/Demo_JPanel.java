package base.swing;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel面板组件的使用
 * 多种布局的使用
 */
public class Demo_JPanel  extends JFrame {

    // 两个面板组件
    JPanel jp1,jp2;

    // 6个按钮
    JButton jb1,jb2,jb3,jb4,jb5,jb6;

    // 构造函数
    public Demo_JPanel(){
        // JPanel默认布局模式是FlowLayout流式布局
        jp1 =new JPanel();
        jp2 =new JPanel();
        jb1 = new JButton("按钮1");
        jb2 = new JButton("按钮2");
        jb3 = new JButton("按钮3");
        jb4 = new JButton("按钮4");
        jb5 = new JButton("按钮5");
        jb6 = new JButton("按钮6");
        jp1.add(jb1);
        jp1.add(jb2);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);
        this.add(jp1);
        this.add(jb3);
        this.add(jp2);
        this.setLayout(new BorderLayout());
        this.add(jp1,BorderLayout.NORTH);
        this.add(jb3,BorderLayout.CENTER);
        this.add(jp2,BorderLayout.SOUTH);
        this.setTitle("面板组件演示");
        this.setSize(500, 300);
        // 禁止用户改变窗体
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_JPanel djp = new Demo_JPanel();
    }

}
