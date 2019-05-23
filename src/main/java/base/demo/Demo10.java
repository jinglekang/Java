package base.demo;

public class Demo10 {
    public static void main(String[] args) {
        Demo10_1 demo10_1 =new Demo10_1();

        System.out.println(demo10_1.a);
        System.out.println(demo10_1.b);
        System.out.println(Demo10_1.c);
    }
}

class Demo10_1 {
    int a = 1;
    int b = 2;
    static int c = 3;
}