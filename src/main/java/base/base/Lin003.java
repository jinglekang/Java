package base.base;

class Outer {
    int score = 95;

    public void inst() {
        Inner in = new Inner();
        in.inner();
    }

    class Inner {
        public void inner() {
            System.out.println("成绩: score = " + score);
        }
    }
}

public class Lin003 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.inst();
    }
}
