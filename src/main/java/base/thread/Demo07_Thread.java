package base.thread;

/**
 * 演示继承Thread类的线程
 */
public class Demo07_Thread {
    public static void main(String[] args) {
        Cat_Thread cat = new Cat_Thread();
        cat.start();
        System.out.println("早上好");
    }
}


class Cat_Thread extends Thread {
    int a = 1;

    public void run() {
        while (true) {
            try {
                System.out.println("早上好" + a);
                Thread.sleep(10);
                if (a == 10) {
                    break;
                }
                a++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}