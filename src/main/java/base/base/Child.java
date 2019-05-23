package base.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Child {
    String name;
    int age;
    static int num = 0;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void joinGame() {
        num++;
        System.out.println("有人加入了游戏！");
    }

    public static void main(String[] args) throws IOException {
        // int num =0;
        // num++;
        // Child ch1 = new Child("张三", 13);
        // ch1.joinGame();
        // num++;
        // Child ch2 = new Child("李四", 12);
        // ch2.joinGame();
        // System.out.println(num);
        for (int a = 1; a <= 4; a++) {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("请输入姓名：");
            String name = br.readLine();
            System.out.println("请输入年龄：");
            String age = br.readLine();
            Integer intAge = Integer.parseInt(age);
            Child cha = new Child(name, intAge);
            cha.joinGame();
        }
        System.out.println("共有"+num+"人加入了游戏！");
    }
}
