package base.demo;

public class Demo2 {
    public static void main(String[] args) {
        Num2 num2 = new Num2(5);
    }

}

class Num2{
    int c=1;
    Num2(int a){
        int i =1;
        do {
            System.out.println(i);
        }while (++i<a);
    }
}
