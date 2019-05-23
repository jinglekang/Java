package base.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 网格布局管理器的使用
 * 1、继承一个JFrame
 * 2、定义需要的组件数组
 * 3、for循环初始化组件
 * 4、设置布局管理器
 * 5、添加组件到布局
 * 5、初始化窗体
 * 6、实例化对象
 */
public class Demo_GridLayout extends JFrame {

    // 定义需要的组件
    int size =9;
    JButton[] jButton = new JButton[size];
    public Demo_GridLayout() {

        // 构造函数初始化组件
        for (int i = 0; i < size; i++) {
            jButton[i]=new JButton("按钮"+String.valueOf(i+1));
        }

        // 设置网格布局管理器并指定对齐方式
        this.setLayout(new GridLayout(3,3,10,10));

        // 添加到网格布局
        for(int i=0;i<size;i++){
            this.add(jButton[i]);
        }

        this.setTitle("流式布局演示");
        this.setSize(500, 300);

        // 禁止用户改变窗体
        this.setResizable(false);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_GridLayout dgl = new Demo_GridLayout();
    }
}
