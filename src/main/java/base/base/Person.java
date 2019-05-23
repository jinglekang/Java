package base.base;

public class Person {


	public static void main(String[] args) {
		
//		Person.Man man1 = new Person().new Man();
//		Person per = new Person();
//		Person.Man man1=per.new Man();
		San man1 =new San();
		man1.name = "С��";
		man1.address = "�Ϻ���";
		man1.age = 25;
		San man2 = man1;
		man1.address="������";
		System.out.println(man2.address);
		
	}

}

class San {
	String name;
	String address;
	int age;
}	