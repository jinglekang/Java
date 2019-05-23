package base.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Demo_JSplitPane extends JFrame implements ListSelectionListener {

    private JPanel jPanelRight;
    // 设置卡片布局
    private CardLayout cardLayout;
    private JList<String> jlt;

    private Demo_JSplitPane() {
        cardLayout = new CardLayout();
        jPanelRight = new JPanel(cardLayout);
        JLabel jll1 = new JLabel(new ImageIcon("images/number/1.jpg"));
        JLabel jll2 = new JLabel(new ImageIcon("images/number/2.jpg"));
        JLabel jll3 = new JLabel(new ImageIcon("images/number/3.jpg"));
        JLabel jll4 = new JLabel(new ImageIcon("images/number/4.jpg"));
        JLabel jll5 = new JLabel(new ImageIcon("images/number/5.jpg"));
        JLabel jll6 = new JLabel(new ImageIcon("images/number/6.jpg"));
        JLabel jll7 = new JLabel(new ImageIcon("images/number/7.jpg"));
        JLabel jll8 = new JLabel(new ImageIcon("images/number/8.jpg"));
        JLabel jll9 = new JLabel(new ImageIcon("images/number/9.jpg"));


        jPanelRight.add(jll1, "0");
        jPanelRight.add(jll2, "1");
        jPanelRight.add(jll3, "2");
        jPanelRight.add(jll4, "3");
        jPanelRight.add(jll5, "4");
        jPanelRight.add(jll6, "5");
        jPanelRight.add(jll7, "6");
        jPanelRight.add(jll8, "7");
        jPanelRight.add(jll9, "8");

        JPanel jPanelLeft = new JPanel();
        String[] words = new String[9];
        words[0] = "(1).一,:壹";
        words[1] = "(2).二,:贰";
        words[2] = "(3).三,:叁";
        words[3] = "(4).四,:肆";
        words[4] = "(5).五,:伍";
        words[5] = "(6).六,:陆";
        words[6] = "(7).七,:柒";
        words[7] = "(8).八,:捌";
        words[8] = "(9).九,:玖";
        jPanelLeft.setBackground(Color.WHITE);
        jPanelRight.setBackground(Color.WHITE);
        jlt = new JList<>(words);
        jlt.addListSelectionListener(this);
        // 设置JList指向时的光标
        jlt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jPanelLeft.add(jlt);
        JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jPanelLeft, jPanelRight);
        // 设置显示收缩和展示按钮
        jsp.setOneTouchExpandable(true);
        // 设置边界线大小(0时不可拖动,setOneTouchExpandable设置不生效)
        jsp.setDividerSize(0);
        // 设置分割条的位置
        jsp.setDividerLocation(100);


        this.add(jsp);
        this.setTitle("拆分窗口演示");
        this.setSize(800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_JSplitPane jSplitPane = new Demo_JSplitPane();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            cardLayout.show(jPanelRight, String.valueOf(jlt.getSelectedIndex()));
        }
    }
}
