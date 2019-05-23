package base.base;

public class ThisTest {


    public static void main(String[] args) {
        Dogss dog1 = new Dogss("大黄");
        Mans man1 = new Mans("小明", dog1);
        man1.showManInfo();
        dog1.showDogInfo();
    }
}

class Mans {
    String name;
    Dogss dogName;

    public Mans(String name, Dogss dogName) {
        this.name = name;
        this.dogName = dogName;
    }

    public void showManInfo() {
        System.out.println("姓名" + "\t" + name);
    }
}

class Dogss {
    String name;

    public Dogss(String name) {
        this.name = name;
    }

    public void showDogInfo() {
        System.out.println("宠物" + "\t" + name);
    }
}