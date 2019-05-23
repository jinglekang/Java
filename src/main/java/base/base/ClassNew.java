package base.base;

public class ClassNew{
	class Cat{
		String name;
	}
	public static void main(String[] args){
		ClassNew cat1 =new ClassNew();
		ClassNew.Cat cat2= cat1.new Cat();
		cat2.name="花花";
		System.out.println("猫的名字叫："+cat2.name);
	}
}