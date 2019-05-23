package base.swing;
/**
 * Java绘图技术演示
 */

import javax.swing.*;
import java.awt.*;

public class Demo_Image extends JFrame {
    public Demo_Image() {
        MyPanel myPanel = new MyPanel();
        this.add(myPanel);
        this.setTitle("我是一个圆");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        Demo_Image demo01 = new Demo_Image();
    }

}

class MyPanel extends JPanel {

    // 覆盖paint方法
    public void paint(Graphics g) {
        // 1、调用父类完成初始化
        super.paint(g);
        // g.setColor(new Color(223,125,220));
        g.setColor(Color.RED);

        // 圆圈
        g.drawOval(20, 20, 20, 20);
        // 实心圆
        g.fillOval(100, 100, 100, 100);

        g.setFont(new Font("微软雅黑", Font.BOLD, 26));
        // 画字符串
        g.drawString("不要不要，叔叔我们不要", 300, 280);

        // 画一个图片
        ImageIcon imageIcon = new ImageIcon("images/ball.jpg");
        Image image = imageIcon.getImage();
        g.drawImage(image, 300, 300, 300, 300, this);

    }
}