package base.base;

public class Demo001 {
    public static void main(String[] args) {
        Persons per = new Persons();
        per.setName("张三");
        per.setAge(15);
        System.out.println(per.getName());
        System.out.println(per.getAge());
    }
}

class Persons {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}