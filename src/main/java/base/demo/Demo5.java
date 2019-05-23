package base.demo;

public class Demo5 {
    public static void main(String[] args) {
        int fish = 36;
        System.out.println("我今天打了" + fish + "条鱼");
        fish = fish / 2;
        System.out.println("然后我卖了一半的鱼，剩下" + fish + "条鱼");
        int give = 3;
        fish = fish - give;
        System.out.println("送给隔壁" + give + "条鱼，剩下" + fish + "条鱼");
        int eat = 1;
        double num1 = 2;
        double num2 = 3;
        int intSell=(int)(fish* (num1 / num2));
        fish = fish -intSell - 1;
        System.out.println("然后又卖了" + intSell + "条鱼，还吃了" + eat + "条，剩下" + fish + "条鱼");
    }
}
