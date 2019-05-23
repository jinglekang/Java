package base.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 移动的小球游戏
 */
public class Demo_Ball extends JFrame {
    BallPalel ballPalel = null;

    public static void main(String[] args) {
        Demo_Ball demo_ball = new Demo_Ball();
    }

    public Demo_Ball() {
        ballPalel = new BallPalel(30, 30);
        this.add(ballPalel);
        this.addKeyListener(ballPalel);
        this.setTitle("运动的小球");
        this.setIconImage(new ImageIcon("images/ball.jpg").getImage());
        // this.setResizable(false);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class BallPalel extends JPanel implements KeyListener {
    int x, y;

    BallPalel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,600,600);
        g.setColor(Color.RED);
        g.fillOval(x, y, 10, 10);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("我输出了值");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==37){
            //System.out.println("左");
            if(x>0){
                x-=10;
            }
        }else if(e.getKeyCode()==38){
            //System.out.println("上");
            if(y>0){
                y-=10;
            }
        }else if(e.getKeyCode()==39){
            //System.out.println("右");
            if(x<590){
                x+=10;
            }
        }else if(e.getKeyCode()==40){
            //System.out.println("下");
            if(y<590){
                y+=10;
            }
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("我松开了按键");

    }
}