package base.enums;

import java.util.Arrays;

public class TestColor {
    public static void main(String[] args) {
        System.out.println(Color.GREEN);
        System.out.println(Color.BLANK);
        System.out.println(Color.YELLOW);
        System.out.println(Color.RED);
        System.out.println("======================");
        System.out.println(Color.GREEN.value);
        System.out.println(Color.BLANK.value);
        System.out.println(Color.YELLOW.value);
        System.out.println(Color.RED.value);
        System.out.println("======================");
        System.out.println(Color.GREEN.index);
        System.out.println(Color.BLANK.index);
        System.out.println(Color.YELLOW.index);
        System.out.println(Color.RED.index);
        System.out.println("======================");
        System.out.println(Arrays.toString(Color.values()));
    }
}
