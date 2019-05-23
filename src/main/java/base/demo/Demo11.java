package base.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo11 {
    public static void main(String[] args) throws IOException {
        System.out.println("0.狗狗录入\n1.打印第1只狗的名字\n2.打印第2只狗的名字");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Doga dog = new Doga();
        for (int a = 1; a >= 1; a++) {
            dog.no = Integer.parseInt(br.readLine());
            dog.dogArr();
        }
    }
}

class Doga {
    public String name;
    public int wight;
    int no = 0;
    Doga dogs[] = new Doga[2];

    public void dogArr() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (no == 0) {
            for (int a = 0; a < dogs.length; a++) {
                dogs[a] = new Doga();
                System.out.println("请输入第" + (a + 1) + "狗的名字：");
                String name = br.readLine();
                dogs[a].name = name;
            }
            System.out.println("输入完成！");
        } else if (no == 1) {
            System.out.println("正在打印第1只狗的名字：");
            System.out.println(dogs[0].name);

        } else if (no == 2) {
            System.out.println("正在打印第2只狗的名字：");
            System.out.println(dogs[0].name);
        } else {
            System.out.println("输入错误");
        }
    }
}
