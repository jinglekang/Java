package base.generic;

public class ReflectionTest {
    public static void main(String[] args) {
        Gen<Integer> gen = new Gen<>(10086);
        gen.showTeeName();
    }
}

class Gen<T> {
    private T t;

    public Gen(T t) {
        this.t = t;
    }

    public void showTeeName() {
        System.out.println(t.getClass().getName());
    }
}