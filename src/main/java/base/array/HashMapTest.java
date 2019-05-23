package base.array;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        Employee employee1 = new Employee("张三", "100586", 44632.321);
        Employee employee2 = new Employee("李四", "100586", 44632.321);
        Employee employee3 = new Employee("王五", "100586", 44632.321);
        hm.put(1, employee1);
        hm.put(2, employee2);
        hm.put(3, employee3);

        if (hm.containsKey(1)) {
            System.out.println("找到了");
            Employee emp = (Employee) hm.get(1);
            System.out.println(emp.getName());

        } else {
            System.out.println("没找到");
        }
        //遍历HashMap所有的值
        Iterator it = hm.keySet().iterator();
        System.out.println("所有学生信息：");
        while (it.hasNext()) {
            int key = (int)it.next();
            Employee emps =(Employee) hm.get(key);
            System.out.println(emps.getName());
        }

    }
}
