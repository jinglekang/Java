/**
 * 功能：冒泡排序和快速排序方法的使用
 */
package base.base;


import base.tool.BubbleSort;

public class Sort {

    public static void main(String[] args) {
        int[] array = {1952, 56, 34, 78, 37, 77, 578, 332, 567, 23333};
        for (int a = 0; a < 10; a++) {
            //依次打印原始数组的内容
            System.out.print(array[a] + " ");
        }
        BubbleSort.sort(array);
        System.out.println();
        for (int a = 0; a < 10; a++)
            System.out.print(array[a] + " ");
        int find = 37;
        System.out.println();
        for (int a = 0; a < array.length; a++) {
            if (array[a] == find) {
                System.out.println("find找到在第" + (a + 1) + "位");
            }
        }
        int[][] abc = new int[4][6];
        abc[1][2] = 1;
        abc[2][1] = 2;
        abc[2][3] = 3;
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 6; b++) {
                System.out.print(abc[a][b]+" ");
            }
            System.out.println();
        }
    }
}

