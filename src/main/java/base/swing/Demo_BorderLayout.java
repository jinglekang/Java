package base.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 边界布局管理器的使用
 * 1、继承一个JFrame
 * 2、定义需要的组件
 * 3、构造函数初始化组件
 * 4、添加组件到边界布局
 * 5、初始化窗体
 * 6、实例化对象
 */
public class Demo_BorderLayout extends JFrame {

    // 创建5个组件
    JButton jb1, jb2, jb3, jb4, jb5;

    private Demo_BorderLayout() {

        // 初始化5个组件
        jb1 = new JButton("按钮1");
        jb2 = new JButton("按钮2");
        jb3 = new JButton("按钮3");
        jb4 = new JButton("按钮4");
        jb5 = new JButton("按钮5");

        // 添加各组件
        this.add(jb1, BorderLayout.CENTER);
        this.add(jb2, BorderLayout.NORTH);
        this.add(jb3, BorderLayout.EAST);
        this.add(jb4, BorderLayout.SOUTH);
        this.add(jb5, BorderLayout.WEST);

        this.setTitle("边界布局演示");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_BorderLayout dbl = new Demo_BorderLayout();
    }

}
