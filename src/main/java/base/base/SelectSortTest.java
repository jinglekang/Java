package base.base;

import base.tool.SelectSort;

public class SelectSortTest {

    public static void main(String[] args) {
        int [] selectArray ={123,467,79,6543,24,678,45654,567654,2,56,78754,34,232,123456,3,5,76,5568,56};
        SelectSort.sort(selectArray);
        for(int a=0;a<selectArray.length;a++){
            System.out.println(selectArray[a]);
        }
    }
}
