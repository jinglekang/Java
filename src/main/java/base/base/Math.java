package base.base;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Math {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(123);
        sb.append(456);
        sb.append(789);
        sb.append("张三");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        sb.setCharAt(10, '李');
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);
        sb.insert(sb.length(), "我是谁");
        System.out.println(sb);
        System.out.println(sb.reverse());
        int num = 520330;
        System.out.println(num);
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
        Thread.sleep(100);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, +3);
        System.out.println(cal.getTime());
    }
}
