package base.base;

public class OverLoadAndOverRide {
    public static void main(String[] args) {
        Num num1 = new Num();
        System.out.println(num1.getMax(5, 4));
        Cat0011 cat1 = new Cat0011();
        Dog0011 dog1 = new Dog0011();
        cat1.cay();
        dog1.cay();
    }

}

class Num {
    public int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else if (a == b) {
            return 0;
        } else {
            return b;
        }
    }
}

class Animal0011 {
    String name;
    int age;

    public void cay() {
        System.out.println("动物叫声");
    }
}

class Cat0011 extends Animal0011 {
    public void cay() {
        System.out.println("喵喵");
    }
}

class Dog0011 extends Animal0011 {
    public void cay() {
        System.out.println("汪汪");
    }
}