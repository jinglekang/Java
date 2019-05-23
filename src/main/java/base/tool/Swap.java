package base.tool;

public class Swap {
    public static void swap(int arraySort[], int a, int b) {
        int temp = arraySort[a];
        arraySort[a] = arraySort[b];
        arraySort[b] = temp;
    }
}