package base.io;

import java.io.File;
import java.io.RandomAccessFile;

public class IoTest {
    public static void main(String[] args) throws Exception {
        // String str = "学无止境ABC";
        // byte[] data = str.getBytes();
        //
        // for (byte b : data) {
        //     System.out.print(Integer.toHexString(b & 0xff) + " ");
        // }
        // System.out.println();
        // String getStr = new String(data, "gbk");
        // System.out.println(getStr);
        // 创建一个文件对象
        File file = new File("D:/Alpha/Code/Projects/untitled/src/com/io/form.xml");
        // System.out.println("是否存在：" + file.exists());
        // System.out.println("是否目录：" + file.isDirectory());
        // System.out.println("是否文件：" + file.isFile());
        // File file1 = new File("D:/Alpha/Code/Projects/untitled/src/com/io/form1.xml");
        // // File file1 =new File("D:/Alpha/Code/Projects/untitled/src/com/io/","form1.xml");
        // if (!file1.exists()) {
        //     file1.createNewFile();
        // } else {
        //     file1.delete();
        // }
        // File file2 = new File("D:/Alpha/Code/Projects/untitled/src/com/");
        // File[] strArray = file2.listFiles();
        // for (File f : strArray) {
        //     System.out.println(f.toString());
        // }
        // System.out.println(file2.isDirectory());

        // System.out.println(file);
        // System.out.println(file.getName());
        // FileUtils.listFile(new File("D:/Alpha/Code/Projects/untitled/src/com/"));
        // 通过读取的方式读入这个对象
        RandomAccessFile raf = new RandomAccessFile(file,"r");
        raf.seek(0);
        byte[] bytes = new byte[(int)raf.length()];
        raf.read(bytes);
        String str = new String(bytes);
        System.out.println(str);
        raf.close();
    }
}