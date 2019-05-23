package base.abnormal;
/**
 * 异常的处理
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;

public class AbnormalTest {
    public static void main(String[] args) {

        //检查异常
        // FileReader fr = new FileReader("D:/Seeyon/迈瑞思插件.docx");

        //处理异常
        try {
            Socket st = new Socket("192.168.1.1", 80);
            System.out.println("端口正常");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("端口无法连接");
        }


        // 连接IP
        FileReader fr=null;
        try {
            fr = new FileReader("D:/Seeyon/迈瑞思插件.docx");
            System.out.println("文件正常");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到文件");
        } finally {
            // finally区域内代码一定会被执行
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("你好");
        }
    }
}
