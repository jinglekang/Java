package base.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EmpManage {
    public static void main(String[] args) throws IOException {
        Emp emp1 = new Emp("张三", "11", 3430);
        Emp emp2 = new Emp("李四", "22", 2330);
        Emp emp3 = new Emp("王五", "33", 3400);
        EmpMan empMan = new EmpMan();
        empMan.addEmp(emp1);
        empMan.addEmp(emp2);
        empMan.addEmp(emp3);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("请输入你要的操作：");
            System.out.println("1：查询员工信息");
            System.out.println("2：修改员工工资");
            System.out.println("3：删除员工信息");
            System.out.println("4：查询共有人员");
            System.out.println("5:退出");
            String imputNum = bf.readLine();
            switch (imputNum) {
                case "1":
                    System.out.println("请输入要查询的员工编号：");
                    String imputNo = bf.readLine();
                    empMan.showInfo(imputNo);
                    break;
                case "2":
                    System.out.println("请依次输入员工编号和修改后的工资：");
                    String changeNo = bf.readLine();
                    double imputCost = Integer.parseInt(bf.readLine());
                    empMan.changeCost(changeNo, imputCost);
                    break;
                case "3":
                    System.out.println("请输入要删除的员工编号：");
                    String delNo = bf.readLine();
                    empMan.delEmp(delNo);
                    break;
                case "4":
                    empMan.showSize();
                    break;
                case "5":
                    return;
            }
        }
    }
}

class EmpMan {
    private ArrayList<Emp> emp = null;

    EmpMan() {
        emp = new ArrayList<>();
    }

    //定义新增人员方法
    void addEmp(Emp emps) {
        emp.add(emps);
    }

    //定义显示人员信息的方法
    void showInfo(String no) {
        // for (int a = 0; a < emp.size(); a++) {
        for (Object anEmp : emp) {
            Emp temp = (Emp) anEmp;
            if (temp.getNo().equals(no)) {
                System.out.println("查询结果：");
                System.out.println("姓名：" + temp.getName());
                System.out.println("编号：" + temp.getNo());
                System.out.println("工资：" + temp.getCost());
                return;
            }
        }
    }

    //修改员工工资
    void changeCost(String no, double newCost) {
        for (Object anEmp : emp) {
            Emp temp = (Emp) anEmp;
            if (temp.getNo().equals(no)) {
                temp.setCost(newCost);
            }
        }
    }

    //删除人员
    void delEmp(String no) {
        for (int a = 0; a < emp.size(); a++) {
            Emp temp = emp.get(a);
            if (temp.getNo().equals(no)) {
                emp.remove(a);
            }
        }
    }

    void showSize() {
        System.out.println("系统中共有" + emp.size() + "个人！");
    }
}

class Emp {
    private String name;
    private String no;
    private double cost;

    Emp(String name, String no, double cost) {
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

    String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    double getCost() {
        return cost;
    }

    void setCost(double cost) {
        this.cost = cost;
    }
}