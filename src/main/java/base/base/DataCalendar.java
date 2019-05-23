package base.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DataCalendar {
    public static void main(String[] args) throws ParseException {
        String ssd = "Wed Sep 16 19:02:36 CST 2009";
        System.out.println("打印字符串格式日期：" + ssd);

        // 定义日期显示格式
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'CST' yyyy", Locale.US);
        Date date= sdf.parse(ssd);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println("打印开始日期" + date);
    }
}
