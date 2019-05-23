package base.socket;
/*
 * 全双工socket连接演示--客户端
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageClient extends JFrame implements ActionListener, KeyListener {
    private JTextArea jTextArea;
    private JTextField jTextField;
    private JButton jButton;
    private PrintWriter printWriter;

    private MessageClient() {

        Font font = new Font("微软雅黑", Font.PLAIN, 12);

        jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        jTextArea.setFont(font);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        JPanel jPanel = new JPanel();
        jTextField = new JTextField(20);
        jTextField.addKeyListener(this);
        jTextField.setFont(font);
        jButton = new JButton("发送");
        jButton.addActionListener(this);
        jButton.setFont(font);
        jPanel.add(jTextField);
        jPanel.add(jButton);

        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanel, BorderLayout.SOUTH);
        this.setTitle("客户端");
        this.setSize(400, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        try {
            Socket socket = new Socket("127.0.0.1", 2048);
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                String info = bufferedReader.readLine();
                jTextArea.append(info + "\r\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void sendMessage() {
        String info = "客户端：" + jTextField.getText();
        printWriter.println(info);
        jTextField.setText("");
        jTextArea.append(info + "\r\n");

    }

    public static void main(String[] args) {
        new MessageClient();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton) {
            this.sendMessage();
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            this.sendMessage();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
