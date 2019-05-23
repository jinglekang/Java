package base.array;

import java.util.Arrays;

public class ArrayKit {

    public static void main(String[] args) {
        String[] str1 = {"张三", "李四", "王五", "赵六", "宋七", "刘八", "吴九", "钱十",};
        String[] string1 = removeElement(str1, 4);
        System.out.println(Arrays.toString(string1));


        System.out.println("----------------------------");

        String[] str2 = {"张三", "李四", "王五", "赵六", "宋七", "刘八", "吴九", "钱十",};
        String[] string2 = removeElement(str2, str2.length-1);
        System.out.println(Arrays.toString(string2));


        System.out.println("----------------------------");

        String[] str3 = {"张三", "李四", "王五", "赵六", "宋七", "刘八", "吴九", "钱十",};
        String[] string3 = extentElement(str3, "插入项", 3);
        System.out.println(Arrays.toString(string3));


        System.out.println("----------------------------");

        String[] str4 = {"张三", "李四", "王五", "赵六", "宋七", "刘八", "吴九", "钱十",};
        String[] string4 = extentElement(str4, "插入项", str4.length);
        System.out.println(Arrays.toString(string4));

    }

    /**
     * 删除数组中指定索引的元素
     *
     * @param s1     数组
     * @param index 要删除的索引
     * @return 返回数组
     */
    private static String[] removeElement(String[] s1, int index) {
        String[] s2 = new String[s1.length - 1];
        System.arraycopy(s1, 0, s2, 0, index);
        System.arraycopy(s1, index+1, s2, index, s1.length - index-1);
        return s2;
    }

    /**
     * @param s1    原始数组
     * @param index 要插入的索引index
     * @return 返回新的数组
     */
    private static String[] extentElement(String[] s1, String str, int index) {
        String[] s2 = new String[s1.length + 1];
        System.arraycopy(s1, 0, s2, 0, index);
        System.arraycopy(s1, index, s2, index + 1, s1.length - index);
        s2[index] = str;
        return s2;
    }
}
