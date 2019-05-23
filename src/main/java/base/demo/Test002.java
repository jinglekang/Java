package base.demo;

public class Test002 {
    public static void main(String[] args) {
        Father father =new Father();
    }
}

class Man {
    Man() {
        System.out.println("人类");
    }

    Man(int i) {
        System.out.println("人类们");
    }
}

class Father extends Man {
    Father() {
        // super(10);
        System.out.println("爸爸");
    }
}