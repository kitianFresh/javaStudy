/**
interface ��һ��������࣬�ӿ�ʹ��Javaӵ����C++�ж��ؼ̳еĻ���
	1.interface���еĳ�Ա����Ĭ������ֻ����public static final����
	2.interface���еĳ�Ա����Ĭ������ֻ����public���ͣ��ҷ���Ĭ����abstract����
	3.��ʵ�ֽӿ���implement�ؼ��֣��ӿڿ��Լ̳нӿ���extends
	4.�ӿ������ÿ���ָ��ʵ�ֽӿڵ�������󣬵���ֻ�ܿ����Լ��ĳ��󷽷������ܿ��������Լ��ķ���
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