package base.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JAVA事件处理机制
 */
public class Demo_ActionListener extends JFrame implements ActionListener {
    private Demo_Panel panel;

    private Demo_ActionListener() {
        panel = new Demo_Panel();
        JButton jButton1 = new JButton("黑色");
        JButton jButton2 = new JButton("红色");
        this.add(jButton1, BorderLayout.NORTH);
        this.add(panel);
        this.add(jButton2, BorderLayout.SOUTH);
        panel.setBackground(Color.green);
        // 注册监听
        jButton1.addActionListener(this);
        jButton1.setActionCommand("黑色");
        jButton2.addActionListener(this);
        jButton2.setActionCommand("红色");
        this.setSize(400, 400);
        this.setTitle("颜色切换");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_ActionListener actionListener = new Demo_ActionListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 判断监听的按钮
        if (e.getActionCommand().equals("黑色")) {
            System.out.println("黑色");
            panel.setBackground(Color.black);
        } else if (e.getActionCommand().equals("红色")) {
            System.out.println("红色");
            panel.setBackground(Color.red);
        }
    }
}

class Demo_Panel extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
    }
}

