package base.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Demo14 {
    public static void main(String[] args) throws ParseException {
        // 把对象转换为字符串类型
        String ssd = "Wed Sep 16 19:02:36 CST 2009";
        System.out.println("打印字符串格式日期：" + ssd);

        // 定义日期显示格式
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date datecal = sdf.parse(ssd);

        Calendar cal = Calendar.getInstance();
        cal.setTime(datecal);
        System.out.println("打印date日期：" + datecal);
        System.out.println("打印Calendar日期：" + cal);

        // 返息频率
        String frequency = "7606108648048183664";
        System.out.println("打印返息频率：" + frequency);

        // 合同期限
        int period = 5;
        System.out.println("打印合同期限：" + period);

        if (frequency.equals("7689908863890376902")) {
            System.out.println("按年返息");
            for (int a = 1; a <= period; a++) {
                cal.add(Calendar.YEAR, +1);
                System.out.println(sdf.format(cal.getTime()));
            }
        } else if (frequency.equals("7606108648048183664")) {
            System.out.println("按半年返息");
            for (int a = 1; a <= period * 2; a++) {
                cal.add(Calendar.MONTH, +6);
                System.out.println(sdf.format(cal.getTime()));
            }
        } else if (frequency.equals("-8124338534420690252")) {
            System.out.println("按季返息");
            for (int a = 1; a <= period * 4; a++) {
                cal.add(Calendar.MONTH, +3);
                System.out.println(sdf.format(cal.getTime()));
            }
        } else if (frequency.equals("-4074882445811628916")) {
            System.out.println("按月返息");
            for (int a = 1; a <= period * 12; a++) {
                cal.add(Calendar.MONTH, +1);
                System.out.println(sdf.format(cal.getTime()));
            }
        } else if (frequency.equals("-59826148012309160")) {
            System.out.println("到期返息");
            cal.add(Calendar.YEAR, +period);
            System.out.println(sdf.format(cal.getTime()));
        }
    }
}
