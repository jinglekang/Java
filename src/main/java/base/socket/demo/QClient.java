package base.socket.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 监听测试的客户端，连接服务器1994端口
 */
public class QClient {
    private QClient() {
        try {
            // 使用socket连接服务器的1994端口
            Socket socket = new Socket("127.0.0.1", 1994);
            // 通过PrintWriter对象发送数据,true代表刷新流
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            // 创建一个从键盘获取值的输入流
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            // 创建一个BufferedReader读取输入流
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 创建InputStreamReader接收服务器段发送的数据流
            InputStreamReader isrIn = new InputStreamReader(socket.getInputStream());
            // 创建BufferedReader读取服务器段的输入流
            BufferedReader bfIn = new BufferedReader(isrIn);
            while (true) {
                System.out.println("请输入要发送的内容：");
                // 发送从键盘获取的内容
                printWriter.println(bufferedReader.readLine());
                // 打印服务器返回的内容
                System.out.println(bfIn.readLine());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        QClient qClient = new QClient();

    }
}
