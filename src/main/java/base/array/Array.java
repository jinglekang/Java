/**
 * 功能：数组的作用
 */
package base.array;

public class Array {
    public static void main(String[] args) {
        // 旧方法就是定义6个变量，然后去计算小鸡的平均体重等
        // float c1 = 3f;
        // float c2 = 4.3f;
        // float c3 = 3.2f;
        // float c4 = 8.45f;
        // float c5 = 7.34f;
        // float c6 = 2.33f;
        // 利用数组实现
        float[] arr = new float[6];
        arr[0] = 3f;
        arr[1] = 4.3f;
        arr[2] = 3.2f;
        arr[3] = 8.45f;
        arr[4] = 7.34f;
        arr[5] = 2.33f;
        float allArr = 0;
        for (int a = 0; a < 6; a++) {
            allArr += arr[a];
        }
        System.out.println("arr数组总分是：" + allArr);
        int ar[] = {2, 3, 4, 5, 6, 7, 9};
        int allAr = 0;
        for (int a = 0; a < ar.length; a++) {
            allAr += ar[a];
        }
        System.out.println("ar数组平均分是：" + (allAr / ar.length));
    }
}

