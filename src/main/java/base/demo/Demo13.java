package base.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Demo13 {
    public static void main(String[] args) throws ParseException {
        String value = "Wed Sep 16 19:02:36 CST 2009";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'CST' yyyy", Locale.US);
        Date d = sdf.parse(value);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d));
        System.out.println(sdf1.format(d));
        System.out.println(sdf2.format(d));
    }
}
