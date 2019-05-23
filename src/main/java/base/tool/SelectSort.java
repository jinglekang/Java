package base.tool;

public class SelectSort {
    public static void sort(int array[]) {
        for (int a = 0; a < array.length; a++) {
            for (int b = a + 1; b < array.length; b++) {
                if (array[a] < array[b]) {
                    Swap.swap(array, a, b);
                }
            }
        }
    }
}
