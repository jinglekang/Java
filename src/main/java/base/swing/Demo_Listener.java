package base.swing;
/**
 * 按键和鼠标监听测试
 */

import javax.swing.*;
import java.awt.event.*;

public class Demo_Listener extends JFrame {

    private Demo_Listener() {
        Demo_Jpanel jpanelClass = new Demo_Jpanel();
        this.add(jpanelClass);
        this.setTitle("鼠标和按键监听测试");
        this.setSize(400, 300);
        // this.setResizable(false);
        this.addMouseMotionListener(jpanelClass);
        this.addKeyListener(jpanelClass);
        this.addWindowListener(jpanelClass);
        this.addMouseListener(jpanelClass);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_Listener demo04 = new Demo_Listener();
    }
}

class Demo_Jpanel extends JPanel implements WindowListener, KeyListener, MouseListener, MouseMotionListener {


    @Override
    // 按键按下
    public void keyTyped(KeyEvent e) {

    }

    @Override
    // 按键值按下
    public void keyPressed(KeyEvent e) {
        System.out.println("按键值被按下");
        System.out.println(e.getKeyChar());

    }

    @Override
    // 按键松开
    public void keyReleased(KeyEvent e) {
        System.out.println("松开了");
    }

    @Override
    // 鼠标点击
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标点击");
        // System.out.println("X轴是：" + e.getX() + "\t" + "Y轴是：" + e.getY());
        // System.out.println(e.getButton());
    }

    @Override
    // 鼠标按下
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标点击拖动");
    }

    @Override
    //鼠标发布
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标释放操作");
    }

    @Override
    // 鼠标进入
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入范围");
    }

    @Override
    // 鼠标退出
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标移出范围");

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("鼠标拖动" + e.getX() + " " + e.getY());

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("鼠标移动" + e.getX() + " " + e.getY());
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("窗口被打开");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("窗口关闭进行中");

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("窗口已经关闭");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("窗口001");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("窗口002");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("窗口被激活");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("窗口被停用");

    }
}
