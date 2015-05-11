/**
interface 是一种特殊的类，接口使得Java拥有了C++中多重继承的机制
	1.interface类中的成员变量默认是且只能是public static final类型
	2.interface类中的成员函数默认是且只能是public类型，且方法默认是abstract方法
	3.类实现接口用implement关键字，接口可以继承接口用extends
	4.接口类引用可以指向实现接口的子类对象，但是只能看到自己的抽象方法，不能看到子类自己的方法
**/

interface Singer{
	void sing();
	void sleep();
}

interface Painter{
	void paint();
	void eat();
}

class Student implements Singer{
	private String name;
	Student(String name){this.name = name;}
	
	public void study(){System.out.println("studying");}
	
	public String getName(){return name;}
	
	public void sing() {System.out.println("student is singing");}
	
	public void sleep(){System.out.println("student is sleeping");}
}

class Teacher implements Singer,Painter{
	private String name;
	Teacher(String name){this.name = name;}
	
	public void teach(){System.out.println("teaching");}
	
	public String getName(){return name;}
	
	public void sing(){System.out.println("teacher is singing");}
	
	public void sleep(){System.out.println("teacher is sleeping");}
	
	public void paint(){System.out.println("teacher is painting");}
	
	public void eat(){System.out.println("teacher is eating");}
}

public class TestInterface{
	public static void main(String args[]){
		Singer s1 = new Student("le");
		s1.sing();s1.sleep();
		Singer s2 = new Teacher("kitian");
		s2.sing();s2.sleep();
		Painter p1 = (Painter)s2;
		p1.paint();p1.eat();
	}
}