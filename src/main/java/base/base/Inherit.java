/**
 * 功能：测试继承的必要性
 */
package base.base;

class Students {
    String name;
    String sex;
    private int age;
    private float cost;
    static float allCost;

    // public Student(String name, String sex, int age, float cost) {
    //     this.name = name;
    //     this.sex = sex;
    //     this.age = age;
    //     this.cost = cost;
    //     allCost += cost * 0.9f;
    // }
    public void printName() {
        System.out.println(name);
    }
}

class Pupils extends Students {
    // public float pay(String name) {
    //     System.out.println(name + "缴纳学费：" + cost);
    //     return cost;
    // }
}

class MidStu extends Students {
}

class ColStu extends Students {
}

public class Inherit {
    public static void main(String[] args) {
        // Pupils pup1 = new Pupils("小明", "男", 13, 300);
        // Pupils pup2 = new Pupils("小文", "女", 12, 400);
        // System.out.println("第一个学生叫：" + pup1.name);
        //         // System.out.println("第二个学生叫：" + pup2.name);
        //         // System.out.println("总共收取学费是：" + Pupils.allCost);
        //         // pup1.pay(pup1.name);
        //         // pup2.pay(pup2.name);
        MidStu mt1 = new MidStu();
        ColStu ct1 = new ColStu();
        Pupils pup1 = new Pupils();
        ct1.name = "李四";
        pup1.name = "王五";
        mt1.name = "张三";
        mt1.printName();
        ct1.printName();
        pup1.printName();
    }
}
