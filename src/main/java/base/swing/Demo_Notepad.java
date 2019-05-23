package base.swing;


import base.swing.kit.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Demo_Notepad extends JFrame implements ActionListener {
    Timer t;
    JLabel timeLable;

    private Demo_Notepad() {

        // 菜单条
        JMenuBar jMenuBar = new JMenuBar();

        // 定义5个菜单
        JMenu jMenu1 = new JMenu("文件(F)");
        jMenu1.setMnemonic('F');
        JMenu jMenu2 = new JMenu("编辑(E)");
        jMenu2.setMnemonic('E');
        JMenu jMenu3 = new JMenu("格式(O)");
        jMenu3.setMnemonic('O');
        JMenu jMenu4 = new JMenu("查看(V)");
        jMenu4.setMnemonic('V');
        JMenu jMenu5 = new JMenu("帮助(H)");
        jMenu5.setMnemonic('H');
        JMenu jMenu1_1 = new JMenu("新建(N)");

        // 定义7个菜单项
        JMenuItem jMenuItem1_2 = new JMenuItem("打开(O)");
        jMenuItem1_2.setMnemonic('O');
        JMenuItem jMenuItem1_3 = new JMenuItem("保存(S)");
        jMenuItem1_3.setMnemonic('S');
        JMenuItem jMenuItem1_4 = new JMenuItem("另存为(A)");
        jMenuItem1_4.setMnemonic('A');
        JMenuItem jMenuItem1_5 = new JMenuItem("页面设置(U)");
        jMenuItem1_5.setMnemonic('U');
        JMenuItem jMenuItem1_6 = new JMenuItem("打印(P)");
        jMenuItem1_6.setMnemonic('P');
        JMenuItem jMenuItem1_7 = new JMenuItem("退出(X)");
        jMenuItem1_7.setMnemonic('X');

        JMenuItem jMenuItem2_1 = new JMenuItem("撤销(U)");
        jMenuItem2_1.setMnemonic('U');
        JMenuItem jMenuItem2_2 = new JMenuItem("剪切(T)");
        jMenuItem2_2.setMnemonic('T');
        JMenuItem jMenuItem2_3 = new JMenuItem("复制(C)");
        jMenuItem2_3.setMnemonic('C');
        JMenuItem jMenuItem2_4 = new JMenuItem("粘贴(P)");
        jMenuItem2_4.setMnemonic('P');
        JMenuItem jMenuItem2_5 = new JMenuItem("删除(L)");
        jMenuItem2_5.setMnemonic('L');
        JMenuItem jMenuItem2_6 = new JMenuItem("查找(F)");
        jMenuItem2_6.setMnemonic('F');
        JMenuItem jMenuItem2_7 = new JMenuItem("查找下一个(N)");
        jMenuItem2_7.setMnemonic('N');
        JMenuItem jMenuItem2_8 = new JMenuItem("替换(R)");
        jMenuItem2_8.setMnemonic('R');
        JMenuItem jMenuItem2_9 = new JMenuItem("转到(G)");
        jMenuItem2_9.setMnemonic('G');
        JMenuItem jMenuItem2_10 = new JMenuItem("全选(A)");
        jMenuItem2_10.setMnemonic('A');
        JMenuItem jMenuItem2_11 = new JMenuItem("时间/日期(D)");
        jMenuItem2_11.setMnemonic('D');


        JCheckBoxMenuItem jCheckBoxMenuItem3_1 = new JCheckBoxMenuItem("自动换行(W)");
        jCheckBoxMenuItem3_1.setMnemonic('W');
        JMenuItem jMenuItem3_2 = new JMenuItem("字体(F)");
        jMenuItem3_2.setMnemonic('F');

        JMenuItem jMenuItem4_1 = new JMenuItem("状态栏(S)");
        jMenuItem4_1.setMnemonic('S');

        JMenuItem jMenuItem5_1 = new JMenuItem("查看帮助(H)");
        jMenuItem5_1.setMnemonic('H');
        JMenuItem jMenuItem5_2 = new JMenuItem("关于记事本(A)");
        jMenuItem5_2.setMnemonic('A');

        // 定义一个二级菜单
        JMenuItem file = new JMenuItem("新建文件(F)");
        file.setMnemonic('F');
        JMenuItem folder = new JMenuItem("新建文件夹(P)");
        file.setMnemonic('P');

        /*
         * 菜单添加开始
         */

        // 把菜单添加到菜单条
        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);
        jMenuBar.add(jMenu3);
        jMenuBar.add(jMenu4);
        jMenuBar.add(jMenu5);

        // 把二级菜单添加到菜单项
        jMenu1_1.add(file);
        jMenu1_1.add(folder);

        // 把菜单项1添加到菜单
        jMenu1.add(jMenu1_1);
        jMenu1.add(jMenuItem1_2);
        jMenu1.add(jMenuItem1_3);
        jMenu1.add(jMenuItem1_4);
        jMenu1.addSeparator();
        jMenu1.add(jMenuItem1_5);
        jMenu1.add(jMenuItem1_6);
        jMenu1.addSeparator();
        jMenu1.add(jMenuItem1_7);

        // 把菜单项2添加到菜单
        jMenu2.add(jMenuItem2_1);
        jMenu2.addSeparator();
        jMenu2.add(jMenuItem2_2);
        jMenu2.add(jMenuItem2_3);
        jMenu2.add(jMenuItem2_4);
        jMenu2.add(jMenuItem2_5);
        jMenu2.addSeparator();
        jMenu2.add(jMenuItem2_6);
        jMenu2.add(jMenuItem2_7);
        jMenu2.add(jMenuItem2_8);
        jMenu2.add(jMenuItem2_9);
        jMenu2.addSeparator();
        jMenu2.add(jMenuItem2_10);
        jMenu2.add(jMenuItem2_11);

        // 把菜单项3添加到菜单
        jMenu3.add(jCheckBoxMenuItem3_1);
        jMenu3.add(jMenuItem3_2);

        // 把菜单项5添加到菜单
        jMenu4.add(jMenuItem4_1);

        // 把菜单项5添加到菜单
        jMenu5.add(jMenuItem5_1);
        jMenu5.add(jMenuItem5_2);

        /*
         * 菜单添加结束
         */

        // 定义一个文本域
        JTextArea jTextArea = new JTextArea();
        // 设置自动换行
        jTextArea.setLineWrap(true);

        // 把文本域添加到滚动窗格里
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        // // 设置工具条
        JToolBar jToolBar = new JToolBar();
        // 设置工具条不可浮动
        jToolBar.setFloatable(false);
        JButton jButton1 = new JButton("打开");
        JButton jButton2 = new JButton("新建");
        JButton jButton3 = new JButton("复制");
        JButton jButton4 = new JButton("剪切");
        JButton jButton5 = new JButton("粘贴");
        JButton jButton6 = new JButton("删除");
        // 添加按钮到工具条
        jToolBar.add(jButton1);
        jToolBar.add(jButton2);
        jToolBar.add(jButton3);
        jToolBar.add(jButton4);
        jToolBar.add(jButton5);
        jToolBar.add(jButton6);

        // 把菜单条添加到工具栏
        this.setJMenuBar(jMenuBar);
        // 把工具条添加到JFrame
        this.add(jToolBar, BorderLayout.NORTH);
        // 把滚动窗格添加到JFrame
        this.add(jScrollPane, BorderLayout.CENTER);

        // 获取当前日期时间的方法1（这种效率略低）
        // JLabel time = new JLabel(String.valueOf(Calendar.getInstance().getTime()));
        // 获取当前日期时间的方法2
        timeLable = new JLabel(String.valueOf(new Date()));
        timeLable.setFont(new Font("微软雅黑",Font.PLAIN,18));

        // 定义一个背景图片1(读取文件的形式)
        // Image image = ImageIO.read(new File("images/2018.jpg"));
        // 定义一个背景图片2(创建ImageIcon然后get的形式)
        Image image = new ImageIcon("images/bg.jpg").getImage();

        // 创建绘制背景图片的panel
        ImagePanel panel = new ImagePanel(image);
        panel.setLayout(new BorderLayout());
        // 把图片加入到panel
        panel.add(timeLable,BorderLayout.EAST);
        // 把panel加入到JFrame的SOUTH位置
        this.add(panel,BorderLayout.SOUTH);
        // 设置定时器1000毫秒刷新一次，注册给this监听
        t = new Timer(1000, this);
        // 启动定时器
        t.start();

        this.setTitle("记事本");
        this.setIconImage(new ImageIcon("images/2017.jpg").getImage());
        this.setSize(900, 600);
        // 设置禁止调整大小(false = 不允许，true = 允许)
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo_Notepad demo_menu = new Demo_Notepad();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 刷新当前时间
        timeLable.setText(String.valueOf(new Date()));
    }
}
