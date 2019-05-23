/**
 * 功能：根据生日计算星座
 */
package base.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zodiac {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入你的出生月：");
        int month = Integer.parseInt(buf.readLine());
        System.out.println("请输入你的出生日：");
        int day = Integer.parseInt(buf.readLine());
        System.out.println(date.constellation(month, day));
    }
}

class Date {
    public String constellation(int Month, int day) {
        String conTion = "";
        switch (Month) {
            case 1:
                if (day <= 19) {
                    conTion = "摩羯座";
                } else {
                    conTion = "水瓶座";
                }
                break;
            case 2:
                if (day <= 18) {
                    conTion = "水瓶座";
                } else {
                    conTion = "双鱼座";
                }
                break;
            case 3:
                if (day <= 20) {
                    conTion = "双鱼座";
                } else {
                    conTion = "白羊座";
                }
                break;
            case 4:
                if (day <= 19) {
                    conTion = "白羊座";
                } else {
                    conTion = "金牛座";
                }
                break;
            case 5:
                if (day <= 20) {
                    conTion = "金牛座";
                } else {
                    conTion = "双子座";
                }
                break;
            case 6:
                if (day <= 20) {
                    conTion = "双子座";
                } else {
                    conTion = "巨蟹座";
                }
                break;
            case 7:
                if (day <= 22) {
                    conTion = "巨蟹座";
                } else {
                    conTion = "狮子座";
                }
                break;
            case 8:
                if (day <= 22) {
                    conTion = "狮子座";
                } else {
                    conTion = "处女座";
                }
                break;
            case 9:
                if (day <= 22) {
                    conTion = "处女座";
                } else {
                    conTion = "天枰座";
                }
                break;
            case 10:
                if (day <= 22) {
                    conTion = "天枰座";
                } else {
                    conTion = "天蝎座";
                }
                break;
            case 11:
                if (day <= 21) {
                    conTion = "天蝎座";
                } else {
                    conTion = "射手座";
                }
                break;
            case 12:
                if (day <= 21) {
                    conTion = "射手座";
                } else {
                    conTion = "摩羯座";
                }
                break;
        }
        return conTion;
    }
}