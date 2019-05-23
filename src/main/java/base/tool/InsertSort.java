package base.tool;

public class InsertSort {
    public static void sort(int array[]) {
        int temp = 0;
        for (int a = 1; a < array.length; a++) {
            temp = array[a];
            for (int b = a; b > 0 && temp > array[b - 1]; b--) {
                array[b] = array[b - 1];
                array[b - 1] = temp;
            }
        }

    }
}