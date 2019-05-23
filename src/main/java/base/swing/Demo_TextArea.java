package base.swing;

import javax.swing.*;
import java.awt.*;

public class Demo_TextArea extends JFrame {
    public Demo_TextArea(){

        // 定义组件
        JPanel jpl2 =new JPanel();

        String[] person = {"张三", "李四", "王五", "赵六", "宋七", "刘八", "孙九", "周十"};

        // 定义一个下拉框
        JComboBox<String> jcb = new JComboBox<>(person);

        // 定义一个按钮
        JButton jbn = new JButton("发送");

        // 多行文本
        JTextArea jat = new JTextArea();

        // 设置自动换行
        jat.setLineWrap(true);

        // 设置不断词换行功能
        jat.setWrapStyleWord(true);

        JScrollPane jsp = new JScrollPane(jat);
        // 单行文本
        JTextField  jtf = new JTextField(10);

        // jpl1.add(jat);
        jpl2.add(jcb);
        jpl2.add(jtf);
        jpl2.add(jbn);

        // 设置布局方式
        // this.add(jpl2);
        this.add(jsp, BorderLayout.CENTER);
        this.add(jpl2,BorderLayout.SOUTH);

        this.setIconImage(new ImageIcon("images/2017.jpg").getImage());
        this.setTitle("聊天窗口演示");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_TextArea demo_textArea =new Demo_TextArea();
    }
}
