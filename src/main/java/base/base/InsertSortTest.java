package base.base;

import base.tool.InsertSort;

public class InsertSortTest {
    public static void main(String[] args) {
        int[] array={13,567,34,678,32,2,466,73,352351,63,3452,4,141,6336,567,568568,45,63};
        InsertSort.sort(array);
        for(int i=1;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
