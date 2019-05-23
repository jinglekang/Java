package base.tool;

public class BubbleSort {
    public static void sort(int array[]) {
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < (array.length - 1 - a); b++) {
                if (array[b] < array[b + 1]) {
                    Swap.swap(array, b, b + 1);
                }
            }
        }
    }
}
