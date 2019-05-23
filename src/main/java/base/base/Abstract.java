package base.base;

/**
 * 功能：抽象类的必要性、接口
 * 作者：竟康
 */
public class Abstract {
    public static void main(String[] args) {
        System.out.println();
        //抽象类的实例化方法
        Animals an = new Animals() {
            @Override
            public void cay() {
                System.out.println("抽象类如何实例化");
            }
        };
        an.cay();
        an = new Cats();
        an.cay();
    }
}

//如果类里面有抽象方法，就必须把类定义成抽象类
abstract class Animals {
    String name;
    //抽象方法没有{}主体
    abstract public void cay();
}

//当一个类继承的父类是抽象类的时候，必须把父类的抽象方法全部实现
class Cats extends Animals {

    public void cay() {
        System.out.println("喵喵");
    }
}