package base.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 流式布局管理器的使用
 * 1、继承一个JFrame
 * 2、定义需要的组件
 * 3、构造函数初始化组件
 * 4、添加组件到布局
 * 5、设置布局管理器
 * 5、初始化窗体
 * 6、实例化对象
 */
public class Demo_FlowLayout extends JFrame {

    // 定义需要的组件
    JButton jb1, jb2, jb3, jb4, jb5,jb6;
    private Demo_FlowLayout(){
        // 构造函数初始化组件
        jb1 = new JButton("按钮1");
        jb2 = new JButton("按钮2");
        jb3 = new JButton("按钮3");
        jb4 = new JButton("按钮4");
        jb5 = new JButton("按钮5");
        jb6 = new JButton("按钮6");

        // 设置流式布局管理器并指定对齐方式
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        // 添加组件到边界布局
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jb5);
        this.add(jb6);

        this.setTitle("流式布局演示");
        this.setSize(500, 300);

        // 禁止用户改变窗体
        this.setResizable(false);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_FlowLayout dfl= new Demo_FlowLayout();
    }
}
