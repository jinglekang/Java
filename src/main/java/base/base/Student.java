/**
 * 作者：竟康
 * 功能：测试private和public的区别
 */
package base.base;


class Stu {
    String name;
    String address;
    private int age;
    private float salary;
    int cost;
    static int allCost;

    public Stu(String name, String address, int age, int cost,float salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary=salary;
        this.cost = cost;
        allCost += cost;
    }

    public static int getAllCost() {
        return allCost;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }
}

public class Student {
    public static void main(String[] args) {
        System.out.println("当前库存现金："+Stu.allCost);
        Stu stu1 = new Stu("张三", "北京市", 15, 1300,3500.34f);
        Stu stu2 = new Stu("李四", "上海市", 16, 200,4665.34f);
        Stu stu3 = new Stu("王五", "天津市", 14, 3000,2455.345f);
        System.out.println("第一个学生："+stu1.name);
        System.out.println("第二个学生："+stu2.name);
        System.out.println("第三个学生："+stu3.name);
        System.out.println("总缴纳学费："+Stu.getAllCost());
        System.out.println("第一个学生年龄："+stu1.getAge());
        System.out.println("第一个学生薪酬："+stu1.getSalary());
    }
}
