package base.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Demo12 {
    public static void main(String[] args) throws IOException {

        //获取当前时间
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //打印当前时间
        System.out.println(format.format(cal.getTime()));

        //获取合同年限
        System.out.print("输入合同年限：");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int period = Integer.parseInt(buf.readLine());

        //获取返息频率frequency
        System.out.print("输入返息频率年、季或者月：");
        String frequency = buf.readLine();


        if (frequency.equals("年")) {
            System.out.println("按年返息");
            for (int a = 1; a <= period; a++) {
                cal.add(Calendar.YEAR, +1);
                System.out.println(format.format(cal.getTime()));
            }
        } else if (frequency.equals("季")) {
            System.out.println("按季返息");
            for (int a = 1; a <= period*4; a++) {
                cal.add(Calendar.MONTH, +3);
                System.out.println(format.format(cal.getTime()));
            }
        } else if (frequency.equals("月")) {
            System.out.println("按月返息");
            for (int a = 1; a <= period*12; a++) {
                cal.add(Calendar.MONTH, +1);
                System.out.println(format.format(cal.getTime()));
            }
        } else {
            System.out.println("你输入的返息频率有误!请输入年、月或者日。");
            return;
        }
    }
}
