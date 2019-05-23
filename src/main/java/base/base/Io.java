package base.base;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Io {
	public static void main(String agrs[]) {
		try {
			// 从键盘接受数字
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			// 从控制台读取一行数据
			System.out.println("请输入第一个人的名字：");
			String a1 = br.readLine();
			System.out.println("请输入第一个人的年龄：");
			String a2 = br.readLine();
			Man man1 = new Man();
			man1.name = a1;
			Integer b2= Integer.parseInt(a2);
			man1.age = b2;
			System.out.println(man1.age+man1.name);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Man {
	String name;
	String address;
	String sex;
	int age;
	double weight;
	double height;
}
