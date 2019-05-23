package base.base;

public class Polymorphism {
    public static void main(String[] args) {
        // Cat cat1 = new Cat();
        // Dog dog1 = new Dog();
        // System.out.println();
        // cat1.cry();
        // dog1.cry();

        // Animal an = new Cat();
        // an.cry();
        // an.eat();
        // an = new Dog();
        // an.cry();
        // an.eat();

        Master ma1 = new Master();
        ma1.feed(new Dog(),new Bone());
        ma1.feed(new Cat001(),new Fisk());
    }
}

//创建一个动物类
class Animal001 {
    protected String name;
    protected int age;

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

    public void cry() {

    }

    public void eat() {

    }
}

class Cat001 extends Animal001 {
    @Override
    public void cry() {
        System.out.println("喵喵");

    }

    @Override
    public void eat() {
        System.out.println("鱼");
    }
}

class Dog extends Animal001 {
    @Override
    public void cry() {
        System.out.println("汪汪");
    }

    @Override
    public void eat() {
        System.out.println("骨头");
    }
}

class Food {
    String name;

    public void showName() {

    }
}

class Fisk extends Food{
    @Override
    public void showName() {
        System.out.println("红烧鱼");
    }
}

class Bone extends Food{
    @Override
    public void showName() {
        System.out.println("红烧排骨");
    }
}

class Master{
    public void feed(Animal001 an,Food fo){
        // System.out.println(an.name);
        an.eat();
        fo.showName();
    }
}