package base.swing;

import javax.swing.*;

/**
 * swing顶层容器功能演示
 */
public class Demo_Swing extends JFrame {

    // 创建一个JButton组件
    JButton jb1 = null;

    public Demo_Swing() {

        // 初始化JButton组件
        jb1 = new JButton("按钮");

        // 添加JButton组件
        this.add(jb1);

        //设置窗口的标题
        this.setTitle("窗口管理");

        // 设置窗口宽度和高度
        this.setSize(400, 300);

        // 设置窗口位置
        // this.setLocation(200,200);

        // 设置窗口相对位置
        this.setLocationRelativeTo(null);

        // 关闭程序时默认关闭虚拟机
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 关闭所有程序进程时关闭虚拟机
        // this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // 显示窗口
        this.setVisible(true);
    }

    public static void main(String[] args) {

        Demo_Swing ds = new Demo_Swing();

    }
}
