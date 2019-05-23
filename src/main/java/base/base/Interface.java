package base.base;

/**
 * 功能：接口如何创建
 * 作者：竟康
 */
public class Interface {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Camera camera = new Camera();
        Phone phone = new Phone();
        System.out.println();
        computer.useUSB(phone);
        computer.useUSB(camera);
        System.out.println(USB.num);
        int no =USB.num;
        no++;
        System.out.println(no);
    }
}

//定义一个USB接口，包含两个方法
interface USB {
    int num = 10086;

    public void start();

    public void stop();
}

//实现接口的同时必须创建所有接口里面的方法
class Camera implements USB {
    @Override
    public void start() {
        System.out.println("相机正在开机！");
    }

    @Override
    public void stop() {
        System.out.println("相机正在关机！");
    }
}

//创建手机类，实现USB接口
class Phone implements USB {
    @Override
    public void start() {
        System.out.println("手机正在开机！");
    }

    @Override
    public void stop() {
        System.out.println("手机正在关机！");
    }
}

//创建计算机类，来使用USB接口
class Computer {
    public void useUSB(USB usb) {
        usb.start();
        usb.stop();
    }
}