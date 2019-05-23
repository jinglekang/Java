package base.swing;

import javax.swing.*;

public class Demo_JDialog extends JDialog {
    private Demo_JDialog() {
        this.setSize(400, 400);

        // 设置隐藏状态栏
        this.setUndecorated(true);

        // 设置打开位置为中心
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_JDialog jDialog = new Demo_JDialog();
    }
}
