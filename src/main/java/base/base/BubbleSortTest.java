package base.base;

import base.tool.BubbleSort;

import java.lang.Math;

public class BubbleSortTest {

    public static void main(String[] args) {
        int len = 50000;
        int[] array = new int[len];
        for (int a = 0; a < len; a++) {
            array[a] = (int) (Math.random() * 1000000);
        }
        System.out.println("开始排序");
        BubbleSort.sort(array);
//        for (int a = 0; a < len; a++) {
//            System.out.println(array[a]);
//        }
        System.out.println("结束排序");

    }
}