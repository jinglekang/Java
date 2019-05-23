package base.base;

public class ConstructionMethod {

	public static void main(String[] args) {
		class Person {
			String name;
//			int age;

			public Person(String name, int age) {
//				name = name;
//				age = age;
				System.out.println(name +"今年"+ age+"岁了");
			}
		}
		Person man1 = new Person("小明", 14);
		man1.name="张三";
		System.out.println(man1.name);
	}
}