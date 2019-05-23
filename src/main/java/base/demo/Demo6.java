package base.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Scanner类和BufferedReader类
 */

public class Demo6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            System.out.println("请输入第一行内容：");
            String s1=sc.next();
            System.out.println("请输入第二行内容：");
            String s2=sc.nextLine();// 第二行会自动截取空格后的值，而且会自动获取Enter按键
            System.out.println("第一行是："+s1);
            System.out.println("第二行是："+s2);

        }
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入内容：");
        String bfStr = bf.readLine();
        System.out.println(bfStr);
    }
}
