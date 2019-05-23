package base.swing;

import javax.swing.*;
import java.awt.*;

public class Demo_Select extends JFrame {
    public Demo_Select() {
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();

        JLabel jl1 = new JLabel("你的籍贯：");
        JLabel jl2 = new JLabel("现住城市：");

        String[] jcbarray = {"北京", "上海", "广州", "深圳", "杭州"};
        JComboBox jcb = new JComboBox(jcbarray);
        JList jList = new JList(jcbarray);
        JScrollPane jsp = new JScrollPane(jList);
        jp1.add(jl1);
        jp1.add(jcb);
        jp2.add(jl2);
        jList.setVisibleRowCount(3);
        jp2.add(jsp);
        this.setTitle("选择演示");
        this.setLayout(new GridLayout(3, 1));
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);

        this.add(jp1);
        this.add(jp2);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_Select ds = new Demo_Select();
    }
}
