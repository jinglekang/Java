package base.demo;

public class Demo7 {
    public static void main(String[] args) {
        //总共天数
        int day = 10;
        //剩余数量
        int last = 1;
        //定义查询第几天
        int setDay = 4;
        //获取查询天数剩余数量
        int getLast = 0;
        for (int a = 1; a < day; a++) {
            if (a == (day - setDay)) {
                getLast = last;
            }
            last = last + 1;
            last = last * 2;

        }
        System.out.println("第" + setDay + "天剩余" + getLast + "个");
        System.out.println("一共有" + last + "个");
    }

}

