package base.swing.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 利用JPanel的双缓冲技术去掉repaint时的闪烁
 */
public class Slide extends MouseAdapter {
    private JFrame frame;
    private int i = 1;

    private Slide() {
        JPanel jPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("images/Scarlett/" + i + ".jpg").getImage(), 0, 0, null);
            }
        };
        frame = new JFrame();
        frame.add(jPanel);
        frame.setSize(1920, 1080); // 大小
        frame.setLocationRelativeTo(null); // 居中
        frame.setResizable(false); // 不可调整
        frame.setUndecorated(true); // 隐藏标题栏
        frame.setVisible(true); // 显示
        frame.addMouseListener(this);
    }

    private void init() {
        while (true) {
            try {
                i++;
                if (i == 16) {
                    i = 1;
                }
                frame.repaint();
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        Slide slide = new Slide();
        slide.init();
    }
}
