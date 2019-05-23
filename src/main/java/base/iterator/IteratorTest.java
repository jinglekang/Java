package base.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        Iterator iterator = list.iterator();
        for (; iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
        System.out.println("===============================");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
