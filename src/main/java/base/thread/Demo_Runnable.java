package base.thread;

/**
 * 演示实现Runnable接口的线程
 */
public class Demo_Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Cat_Runnable());
        t.start();
        System.out.println("早上好");
    }
}

class Cat_Runnable implements Runnable {
    int a = 1;

    public void run() {
        while (true) {
            System.out.println("早上好" + a);
            try {
                Thread.sleep(100);
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