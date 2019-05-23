package base.swing.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class Notepad extends JFrame implements ActionListener {
    // 定义正文字体
    private Font bodyFont = new Font("微软雅黑", Font.PLAIN, 16);
    private JTextArea jTextArea;
    private String filePath = null;
    private JCheckBoxMenuItem jCheckBoxMenuItem4_1;
    private JToolBar jToolBar = null;


    private Notepad() {

        // 定义菜单字体
        Font headFont = new Font("微软雅黑", Font.PLAIN, 12);
        // 菜单条
        JMenuBar jMenuBar = new JMenuBar();


        // 定义5个菜单
        JMenu jMenu1 = new JMenu("文件(F)");
        jMenu1.setMnemonic('F');
        jMenu1.setFont(headFont);

        JMenu jMenu2 = new JMenu("编辑(E)");
        jMenu2.setMnemonic('E');
        jMenu2.setFont(headFont);

        JMenu jMenu3 = new JMenu("格式(O)");
        jMenu3.setMnemonic('O');
        jMenu3.setFont(headFont);

        JMenu jMenu4 = new JMenu("查看(V)");
        jMenu4.setMnemonic('V');
        jMenu4.setFont(headFont);

        JMenu jMenu5 = new JMenu("帮助(H)");
        jMenu5.setMnemonic('H');
        jMenu5.setFont(headFont);

        JMenu jMenu1_1 = new JMenu("新建(N)");
        jMenu1_1.setFont(headFont);


        // 定义7个菜单项
        JMenuItem jMenuItem1_2 = new JMenuItem("打开(O)");
        jMenuItem1_2.setMnemonic('O');
        jMenuItem1_2.setFont(headFont);
        // 注册监听
        jMenuItem1_2.addActionListener(this);
        jMenuItem1_2.setActionCommand("open");

        JMenuItem jMenuItem1_3 = new JMenuItem("保存(S)");
        jMenuItem1_3.setMnemonic('S');
        jMenuItem1_3.setFont(headFont);
        jMenuItem1_3.addActionListener(this);
        jMenuItem1_3.setActionCommand("save");

        JMenuItem jMenuItem1_4 = new JMenuItem("另存为(A)");
        jMenuItem1_4.setMnemonic('A');
        jMenuItem1_4.setFont(headFont);
        jMenuItem1_4.addActionListener(this);
        jMenuItem1_4.setActionCommand("outSave");

        JMenuItem jMenuItem1_5 = new JMenuItem("页面设置(U)");
        jMenuItem1_5.setMnemonic('U');
        jMenuItem1_5.setFont(headFont);

        JMenuItem jMenuItem1_6 = new JMenuItem("打印(P)");
        jMenuItem1_6.setMnemonic('P');
        jMenuItem1_6.setFont(headFont);

        JMenuItem jMenuItem1_7 = new JMenuItem("退出(X)");
        jMenuItem1_7.setMnemonic('X');
        jMenuItem1_7.setFont(headFont);


        JMenuItem jMenuItem2_1 = new JMenuItem("撤销(U)");
        jMenuItem2_1.setMnemonic('U');
        jMenuItem2_1.setFont(headFont);

        JMenuItem jMenuItem2_2 = new JMenuItem("剪切(T)");
        jMenuItem2_2.setMnemonic('T');
        jMenuItem2_2.setFont(headFont);

        JMenuItem jMenuItem2_3 = new JMenuItem("复制(C)");
        jMenuItem2_3.setMnemonic('C');
        jMenuItem2_3.setFont(headFont);

        JMenuItem jMenuItem2_4 = new JMenuItem("粘贴(P)");
        jMenuItem2_4.setMnemonic('P');
        jMenuItem2_4.setFont(headFont);

        JMenuItem jMenuItem2_5 = new JMenuItem("删除(L)");
        jMenuItem2_5.setMnemonic('L');
        jMenuItem2_5.setFont(headFont);

        JMenuItem jMenuItem2_6 = new JMenuItem("查找(F)");
        jMenuItem2_6.setMnemonic('F');
        jMenuItem2_6.setFont(headFont);

        JMenuItem jMenuItem2_7 = new JMenuItem("查找下一个(N)");
        jMenuItem2_7.setMnemonic('N');
        jMenuItem2_7.setFont(headFont);

        JMenuItem jMenuItem2_8 = new JMenuItem("替换(R)");
        jMenuItem2_8.setMnemonic('R');
        jMenuItem2_8.setFont(headFont);

        JMenuItem jMenuItem2_9 = new JMenuItem("转到(G)");
        jMenuItem2_9.setMnemonic('G');
        jMenuItem2_9.setFont(headFont);

        JMenuItem jMenuItem2_10 = new JMenuItem("全选(A)");
        jMenuItem2_10.setMnemonic('A');
        jMenuItem2_10.setFont(headFont);

        JMenuItem jMenuItem2_11 = new JMenuItem("时间/日期(D)");
        jMenuItem2_11.setMnemonic('D');
        jMenuItem2_11.setFont(headFont);


        JCheckBoxMenuItem jCheckBoxMenuItem3_1 = new JCheckBoxMenuItem("自动换行(W)");
        jCheckBoxMenuItem3_1.setMnemonic('W');
        jCheckBoxMenuItem3_1.setFont(headFont);

        JMenuItem jMenuItem3_2 = new JMenuItem("字体(F)");
        jMenuItem3_2.setMnemonic('F');
        jMenuItem3_2.setFont(headFont);

        jCheckBoxMenuItem4_1 = new JCheckBoxMenuItem("工具条(S)");
        jCheckBoxMenuItem4_1.setMnemonic('S');
        jCheckBoxMenuItem4_1.setFont(headFont);
        //
        jCheckBoxMenuItem4_1.addActionListener(this);
        jCheckBoxMenuItem4_1.setActionCommand("statusBar");

        JMenuItem jMenuItem5_1 = new JMenuItem("查看帮助(H)");
        jMenuItem5_1.setMnemonic('H');
        jMenuItem5_1.setFont(headFont);
        jMenuItem5_1.addActionListener(this);
        jMenuItem5_1.setActionCommand("help");

        JMenuItem jMenuItem5_2 = new JMenuItem("关于记事本(A)");
        jMenuItem5_2.setMnemonic('A');
        jMenuItem5_2.setFont(headFont);
        // 注册监听
        jMenuItem5_2.addActionListener(this);
        jMenuItem5_2.setActionCommand("about");


        // 定义一个二级菜单
        JMenuItem file = new JMenuItem("新建文件(F)");
        file.setMnemonic('F');
        file.setFont(headFont);

        JMenuItem folder = new JMenuItem("新建文件夹(P)");
        folder.setMnemonic('P');
        folder.setFont(headFont);


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
        jMenu4.add(jCheckBoxMenuItem4_1);

        // 把菜单项5添加到菜单
        jMenu5.add(jMenuItem5_1);
        jMenu5.add(jMenuItem5_2);

        /*
         * 菜单添加结束
         */

        // 定义一个文本域
        jTextArea = new JTextArea();
        // 设置文本框字体
        jTextArea.setFont(bodyFont);
        // 设置自动换行
        jTextArea.setLineWrap(true);

        // 把文本域添加到滚动窗格里
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        // 把滚动窗格添加到JFrame
        this.add(jScrollPane, BorderLayout.CENTER);
        // 把菜单条添加到工具栏
        this.setJMenuBar(jMenuBar);

        this.setTitle("记事本 Alpha");
        // 记事本图标
        this.setIconImage(new ImageIcon("images/notepad-icon.png").getImage());
        this.setSize(900, 600);
        // 禁止改变窗口大小
        // this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Notepad notepad = new Notepad();
    }

    private static void Writer(String URLPath, String content) {
        System.out.println(URLPath);
        FileWriter fileWriter = null;
        BufferedWriter writer = null;
        try {
            fileWriter = new FileWriter(URLPath);
            writer = new BufferedWriter(fileWriter);
            writer.write(content);
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "about": {
                System.out.println("关于记事本");

                JDialog jDialog = new JDialog();

                JLabel jLabel = new JLabel("记事本 Alpha版，待完善相关功能");
                jLabel.setFont(bodyFont);
                jDialog.add(jLabel);

                jDialog.setTitle("关于记事本");
                // 记事本图标
                jDialog.setSize(300, 300);
                // 禁止改变窗口大小
                jDialog.setResizable(false);
                jDialog.setAlwaysOnTop(true);
                jDialog.setLocationRelativeTo(null);
                jDialog.setVisible(true);
                break;
            }
            case "help": {
                System.out.println("查看帮助");

                JDialog jDialog = new JDialog();

                JTextArea jTextArea = new JTextArea();
                // 设置字体
                jTextArea.setFont(bodyFont);
                // 设置自动换行
                jTextArea.setLineWrap(true);
                // 设置不可编辑
                jTextArea.setEditable(false);
                jTextArea.append("目录\n");
                jTextArea.append("如何打开和保存文件\n");
                jTextArea.append("如何使用查询和替换\n");
                jTextArea.append("如何设置字符编码\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                jTextArea.append("测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本测试文本\n");
                // 设置默认显示位置，0代表从首行显示，
                // 注意：必须在内容后设置显示位置
                jTextArea.setCaretPosition(0);

                // 把文本域添加到滚动窗格里
                JScrollPane jScrollPane = new JScrollPane(jTextArea);
                jDialog.add(jScrollPane);

                jDialog.setTitle("查看帮助");
                // 记事本图标
                jDialog.setSize(400, 500);
                // 禁止改变窗口大小
                jDialog.setResizable(false);
                jDialog.setAlwaysOnTop(true);
                jDialog.setLocationRelativeTo(null);
                jDialog.setVisible(true);
                break;
            }
            case "statusBar":
                System.out.println("工具条");
                if (jCheckBoxMenuItem4_1.getState()) {

                    // // 设置工具条
                    jToolBar = new JToolBar();
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

                    // 把工具条添加到JFrame
                    this.add(jToolBar, BorderLayout.NORTH);
                    this.setVisible(true);
                }
                if (!jCheckBoxMenuItem4_1.getState()) {
                    this.remove(jToolBar);
                    this.setVisible(true);

                }
                break;
            case "open":
                System.out.println("打开");
                // 创建文件选择对象JFileChooser
                JFileChooser jFileChooser = new JFileChooser();
                // 设置标题
                jFileChooser.setDialogTitle("打开");
                // 显示打开界面
                jFileChooser.showOpenDialog(null);
                // 显示该对象
                jFileChooser.setVisible(true);
                // 获取文件绝对路径
                if (jFileChooser.getSelectedFile() != null) {
                    filePath = jFileChooser.getSelectedFile().getAbsolutePath();
                    RandomAccessFile raf = null;
                    try {
                        // 读取文件流
                        raf = new RandomAccessFile(filePath, "r");
                        byte[] bytes = new byte[(int) raf.length()];
                        raf.read(bytes);
                        String content = new String(bytes, StandardCharsets.UTF_8);
                        jTextArea.setText(content);

                    } catch (Exception e1) {
                        e1.printStackTrace();
                    } finally {

                        if (raf != null) {
                            try {
                                raf.close();
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }

                        }
                    }
                }
                break;
            case "save":
                System.out.println("保存");
                if (filePath != null) {
                    Notepad.Writer(filePath, jTextArea.getText());
                } else {
                    jFileChooser = new JFileChooser();
                    // 设定只选择目录
                    jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    // 设置标题
                    jFileChooser.setDialogTitle("另存为");
                    // 显示打开界面
                    jFileChooser.showOpenDialog(null);
                    // 显示该对象
                    jFileChooser.setVisible(true);
                    if (jFileChooser.getSelectedFile() != null) {
                        System.out.println(jFileChooser.getSelectedFile().getAbsolutePath());
                        /*
                        未实现功能
                         */
                    }
                }
                break;
            case "outSave":
                System.out.println("另存为");
                jFileChooser = new JFileChooser();
                // 设置标题
                jFileChooser.setDialogTitle("另存为");
                // 显示打开界面
                jFileChooser.showSaveDialog(null);
                // 显示该对象
                jFileChooser.setVisible(true);
                if (jFileChooser.getSelectedFile() != null) {
                    filePath = jFileChooser.getSelectedFile().getAbsolutePath();
                    Notepad.Writer(filePath, jTextArea.getText());
                }
                break;
        }
    }
}
