package base.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReturnPyramid {

	public static void main(String[] args) throws IOException {
		class Int00 {
			public void int01(int int02) {
				for (int a = 1; a <= int02; a++) {
					for (int b = 1; b <= int02 - a; b++) {
						System.out.print(" ");
					}
					for (int c = 1; c <= a * 2 - 1; c++) {
						System.out.print("*");
					}

					System.out.println();
				}
			}
		}
		System.out.println("请输入三角形层数：");
		 InputStreamReader isr = new InputStreamReader(System.in);
		 BufferedReader buf1 = new BufferedReader(isr);
		 String str01 = buf1.readLine();
		 Int00 num = new Int00();
		 int int1 = Integer.parseInt(str01);
		 num.int01(int1);
		// new Int00().int01(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
	}

}
