package base.socket.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端监听1994端口
 */
public class QServer {
    private QServer() {
        try {
            System.out.println("正在启动监听服务！");
            // 设置监听端口
            ServerSocket ss = new ServerSocket(1994);
            System.out.println("已启动监听服务，等候连接！");
            // 等待客户段连接，连接后返回socket连接
            Socket socket = ss.accept();
            // 创建输入流，从socket里拿到流
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            // 使用BufferedReader读取输入流
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 打印输入流的一行
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            // 从控制台接收信息
            InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
            BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader1);
            while (true) {
                // 读取客户端发送的数据并打印
                System.out.println(bufferedReader.readLine());
                System.out.println("请输入回复内容：");
                // 把从键盘获取的内容反馈给客户端
                printWriter.println(bufferedReader1.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        QServer qServer = new QServer();
    }

}
