package base.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

/**
 * 功能：数组的排序
 */
public class MaxArray {
    public static void main(String[] args) throws IOException {
        //实例化一个对象
        DogClass dog = new DogClass();
        //实例化一个对象数组
        DogClass[] dogArr = new DogClass[4];
        for (int a = 0; a < 4; a++) {
            //实例化每个对象数组的成员
            dogArr[a] = new DogClass();
            //赋值狗名字和体重
            dogArr[a].setName("狗" + (a + 1));
            dogArr[a].setWight((20 * (Math.random() * 20)));
            System.out.print(dogArr[a].getName() + "体重是：");
            System.out.println(dogArr[a].getWight());
            //合计总体重
            DogClass.allWight += dogArr[a].getWight();
        }
        System.out.println("总体重是：" + DogClass.allWight);
        //计算平均体重
        DogClass.aveWight = DogClass.allWight / dogArr.length;
        System.out.println("平均体重是：" + DogClass.aveWight);
        double maxWight = dogArr[0].getWight();
        int maxIndex = 0;
        for (int i = 1; i < dogArr.length; i++) {
            if (maxWight < dogArr[i].getWight()) {
                maxWight = dogArr[i].getWight();
                maxIndex = i;
            }
        }
        System.out.println("第" + (maxIndex + 1) + "体重最大是：" + maxWight);
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    }
}

class DogClass {
    private String name = "";
    private double wight = 0;
    static double allWight = 0;
    static double aveWight = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected double getWight() {
        return wight;
    }

    protected void setWight(double wight) {
        this.wight = wight;
    }
}
