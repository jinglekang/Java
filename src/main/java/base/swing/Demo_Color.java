package base.swing;

import javax.swing.*;
import java.awt.*;

public class Demo_Color extends JFrame {
    public Demo_Color(){
        JButton jButton1 = new JButton("黑色");
        JButton jButton2 = new JButton("蓝色");
        JPanel jPanel =new JPanel();

        this.add(jButton1,BorderLayout.NORTH);
        this.add(jButton2,BorderLayout.SOUTH);
        this.setTitle("颜色变换");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        // this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_Color demo_color = new Demo_Color();
    }

}
