package base.base;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloWord {
    public static void main(String agrs[]) {
//		int a = 1;
//		a+=90;
//		a=a+1;
//		a+=1;
//		int b = 2;
//		int c = ++a + b++;
//		System.out.println(c+b);
//		String name = "张三李四王五赵六";
//		System.out.println("我的名字叫"+name);
//		int ac = 128;
//		int ad = 129;
//		ac++;
//		if(ac==ad){System.out.println("ac等于ad");}
//		ac++;
//		if(ac>=ad){System.out.println("ac大等ad");}
//		ac--;
//		if(ac<=ad){System.out.println("ac小等ad");}
        try {
            //从键盘接受数字
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            //从控制台独去一行数据
            System.out.println("请输入第一个数字：");
            String a1 = br.readLine();
            System.out.println("请输入第二数字：");
            String a2 = br.readLine();

            float num1 = Float.parseFloat(a1);
            float num2 = Float.parseFloat(a2);

//			Float.valueOf(a1);
//			Float.valueOf(a2); 
//			System.out.println(num1+num2);
            if (num1 > num2) {
                System.out.println("第一个数字大");
            }
            if (num1 == num2) {
                System.out.println("两个数字相等");
            }
            if (num1 < num2) {
                System.out.println("第二个数字大");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
