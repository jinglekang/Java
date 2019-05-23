package base.base;

public class Cat {
    public static void main(String[] args) {
        NewCat cat1= new NewCat();
        cat1.name="小白";
        cat1.age=1;
        cat1.color="白色";
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println(cat1.color);
    }
}

class NewCat {
    public String name;
    protected int age;
    String color;
    private float price;

    public float getName() {
        price = 100f;
        return price;
    }
}