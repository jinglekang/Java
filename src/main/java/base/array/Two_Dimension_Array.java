package base.array;

public class Two_Dimension_Array {
    public static void main(String[] args) {
        int a, b, c, d;
        int[][] score = {{103, 34, 23, 46}, {104, 78, 99, 66}, {105, 43, 74, 87}, {106, 46, 88, 66}};
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
