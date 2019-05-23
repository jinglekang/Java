package base.base;

import java.text.SimpleDateFormat;

public class Time {
    public static void main(String[] args) {
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String TimeString = time.format(new java.util.Date());
        System.out.println(TimeString);
    }
}
