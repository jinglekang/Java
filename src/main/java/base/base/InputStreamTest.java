package base.base;


import java.io.*;
import java.lang.Math;

/**
 * 文件读取和创建测试
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        // 创建文件对象
        // File fis = new File("C:/Users/JING/Desktop/TEMP/新建文本文档.txt");
        // 通过文件对象读取文件路径
        // InputStream is1 = new FileInputStream(fis);

        // 直接通过文件路径读取文件
        InputStream is2 = new FileInputStream("C:/Users/JING/Desktop/TEMP/新建文本文档.txt");
        is2.close();

        // 创建文件对象
        // File fos = new File("C:/Users/JING/Desktop/TEMP/新建文本文档.txt");
        // 通过文件对象创建文件
        // OutputStream os1 = new FileOutputStream(fos);

        // 直接通过文件路径创建文件
        // OutputStream os2 = new FileOutputStream("C:/Users/JING/Desktop/TEMP/新建文本文档.txt");
        // os2.close();

        // 批量创建文件测试
        for(int a=1;a<=20;a++){
            String math ="C:/Users/JING/Desktop/TEMP/"+Math.random()*3+".txt";
            OutputStream os2 = new FileOutputStream(math);
            // System.out.print(a+" ");
        }
    }
}