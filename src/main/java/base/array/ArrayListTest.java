/**
 * 功能：集合类的使用
 */
package base.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> a1 = new ArrayList<Employee>();
        System.out.println(a1.size());
        Employee ep1 = new Employee("张三", "20180722", 3430);
        Employee ep2 = new Employee("李四", "20170714", 2330);
        Employee ep3 = new Employee("王五", "20180203", 3400);
        a1.add(ep1);
        a1.add(ep2);
        a1.add(ep3);
        a1.add(ep3);
        System.out.println(a1.size());
        //循环打印所有对象的名称
        for (int a = 0; a < a1.size(); a++) {
            Employee temp = a1.get(a);
            System.out.println(temp.getName());
        }
        System.out.println();
        //从集合中删除一个对象
        a1.remove(3);
        for (int a = 0; a < a1.size(); a++) {
            Employee temp = a1.get(a);
            System.out.println(temp.getName());
        }
    }
}

class Employee {
    private String name;
    private String no;
    private double cost;

    Employee(String name, String no, double cost) {
        this.name = name;
        this.no = no;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}