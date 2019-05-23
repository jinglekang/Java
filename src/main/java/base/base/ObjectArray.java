/**
 * 功能：对象数组如何使用
 */

package base.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjectArray {
    public static void main(String[] args) throws IOException {
        System.out.println("欢迎使用狗狗统计系统！");
        System.out.println("请选择功能模块：");
        System.out.println("1.狗狗录入\n2.狗狗总体重查询\n3.狗狗平均体重查询\n101.打印第一支狗的名字");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //实例化一只狗
        Dogs dog = new Dogs();
        Dogs[] dogs = new Dogs[3];
        for (int a = 1; a >= 1; a++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 1) {
                for (int b = 0; b < dogs.length; b++) {
                    dogs[b] = new Dogs();
                    System.out.println("请输入第" + (b + 1) + "狗的名字：");
                    //从键盘获取狗的名字
                    String name = br.readLine();
                    //保存狗的名字
                    dogs[b].setName(name);
                    System.out.println("请输入第" + (b + 1) + "狗的体重：");
                    //从键盘获取狗的体重并转化为integer类型
                    int wight = Integer.parseInt(br.readLine());
                    //保存狗的体重
                    dogs[b].setWight(wight);
                }
                System.out.println("输入完成！");
                for (int b = 0; b < dogs.length; b++) {
                    //合计狗的通知赋值给allWight
                    Dogs.allWight += dogs[b].getWight();
                }
            } else if (num == 2) {
                System.out.println("所有狗的总体中是："+Dogs.allWight);
            } else if (num == 3) {
                Dogs.aveWight = Dogs.allWight / (dogs.length);
                System.out.println("所有狗的平均体重是："+Dogs.aveWight);
            } else if (num == 101) {
                System.out.println("正在打印第1只狗的名字：");
                System.out.println(dogs[0].getName());
            }
        }
    }
}

class Dogs {
    private String name;
    private int wight;
    static int allWight = 0;
    static int aveWight = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }
}