package base.swing.project;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class BallGame extends JFrame {

    // private Image image = new ImageIcon("images/bg.jpg").getImage();
    // private Image ball = new ImageIcon("images/ball.png").getImage();
    private Image ball = new ImageIcon(Objects.requireNonNull(BallGame.class.getClassLoader().getResource("images/ball.png"))).getImage();
    private Image image = new ImageIcon(Objects.requireNonNull(BallGame.class.getClassLoader().getResource("images/bg.jpg"))).getImage();


    private double x = 0;
    private double y = 0;
    private double degree = 3.14 / 3;

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);

        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);

        if (y > 680 | y < 0) {
            degree = -degree;
        }
        if (x > 1230 | x < 0) {
            degree = 3.14 - degree;
        }

    }

    private void initFrame() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true); // 隐藏标题栏
        setVisible(true);

        boolean init = true;
        while (init) {
            try {
                Thread.sleep(20);
                repaint();
            } catch (Exception e) {
                init = false;
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("游戏正在启动");
        BallGame ballGame = new BallGame();
        ballGame.initFrame();
    }
}
