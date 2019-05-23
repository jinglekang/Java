package base.generic;

import java.util.ArrayList;

/**
 * 功能：泛型的测试
 * 作者：竟康
 */
public class Generic {
    public static void main(String[] args) {
        ArrayList<Dog> al =new ArrayList<Dog>();
        Dog dog1 = new Dog();
        dog1.setName("大黄");
        al.add(dog1);
        Dog temp = al.get(0);
        System.out.println(temp.getName());
    }
}

class Dog{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}