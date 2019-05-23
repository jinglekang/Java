package base.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo8 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入数字选择计算类型：");
        System.out.println("1：+\n2:-\n3:*\n4:/");
        String str1 = buf1.readLine();
        int int1 = Integer.parseInt(str1);
        if (int1 == 1) {
            System.out.println("你选择的是加法，请输入第一个数字：");

        } else if (int1 == 2) {
            System.out.println("你选择的是减法，请输入第一个数字：");

        } else if (int1 == 3) {
            System.out.println("你选择的是乘法，请输入第一个数字：！");

        } else if (int1 == 4) {
            System.out.println("你选择的是除法，请输入第一个数字：！");

        } else {
            System.out.println("输入错误！");
            return;
        }
        int int2 = Integer.parseInt(buf1.readLine());
        System.out.println("请输入第二个数字：");
        int int3 = Integer.parseInt(buf1.readLine());
        System.out.println("计算结果是：");
        if (int1 == 1) {
            System.out.println(int2 + int3);

        } else if (int1 == 2) {
            System.out.println(int2 - int3);

        } else if (int1 == 3) {
            System.out.println(int2 * int3);

        } else if (int1 == 4) {
            System.out.println(int2 / int3);

        } else {
            System.out.println("这是一个彩蛋！");
        }
    }
}
