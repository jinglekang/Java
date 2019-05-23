package base.swing;

import javax.swing.*;

public class Demo_JWindows extends JWindow implements Runnable{
    public Demo_JWindows(){
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_JWindows jWindows = new Demo_JWindows();
        Thread t = new Thread(jWindows);
        t.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            this.setVisible(false);
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
