/**
 * 功能：快速排序的测试
 * 作者：竟康
 * 状态：未完成
 */
package base.base;


import base.tool.Swap;

import java.lang.Math;


public class QuickSort {
    public static void main(String[] args) {
        System.out.println("快速排序测试");
        //定义数组长度
        int len = 8;
        int[] array = new int[len];
        //通过随机数给数组赋值
        for (int a = 0; a < len; a++) {
            array[a] = (int) (Math.random() * len);
            System.out.print(array[a]);
        }
        System.out.println();
        for (int b = 1; b < len; b++) {
            if (array[b] < array[0]) {
                Swap.swap(array, b, 0);
            }
        }
        for (int a = 0; a < len; a++) {
            System.out.print(array[a]);
        }
    }
}
