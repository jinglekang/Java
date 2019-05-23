package base.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassMethod {

    public static void main(String[] args) throws IOException {
        class Man {
            // String name;
            // String address;
            // int age;

            public void speak() {
                System.out.println("I am good man");
            }

            // public void count1() {
            // int num1 = 0;
            // for (int a = 1; a <= 1000; a++) {
            // num1 += a;
            // }
            // System.out.println("count1的名字是" + num1);
            // }

            // public void count2() throws IOException {
            // InputStreamReader isr = new InputStreamReader(System.in);
            // BufferedReader br = new BufferedReader(isr);
            // String strNum1 = br.readLine();
            // Integer intNum1 = Integer.parseInt(strNum1);
            // int num2 = 0;
            // for (int b = 1; b <= intNum1; b++) {
            // num2 += b;
            // }
            // System.out.println("count2?????"+num2);
            // }

            // public void count3(int n) {
            // 	int num3 = 0;
            // 	for (int c = 1; c <= n; c++) {
            // 		num3 += c;
            // 	}
            // 	System.out.println("count3?????" + num3);
            // }
            //
            // public void count4(int num01, int num02) {
            // 	int num00 = num01 + num02;
            // 	System.out.println("num00的名字是" + num00);
            // }
            public String count5(String num03, String num04) {
                return num03 + num04;
            }
        }
        Man man1 = new Man();
        man1.speak();
        // man1.count1();
        // man1.count2();
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // String rd1 = br.readLine();
        // Integer x = Integer.parseInt(rd1);
        // man1.count3(x);
        // man1.count4(20, 30);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader brs = new BufferedReader(isr);
        String num03 = brs.readLine();
        String num04 = brs.readLine();
        // String str005=man1.count5(num03, num04);
        System.out.println(man1.count5(num03, num04));

    }

}