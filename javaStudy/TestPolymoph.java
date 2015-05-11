/**
多态很好的实现了程序的扩展性而不用每次都做判断；
多态是在程序运行过程中（不是在编译阶段），动态的判断对象引用实际所指对象类型来调用相应的方法
多态的三个要点：1.继承
				2.重写
				3.父类引用指向子类对象//这种写法是一种很好的风格，能提高程序的可扩展性
**/
class Animal{
	public String name;
	Animal(String name){
		this.name = name;
	}
	
	public void enjoy(){
		System.out.println("叫声......");
	}
	
	//abstract public void enjoy(){}含抽象方法的类必须声明为抽象类abstract class
}

class Cat extends Animal{
	public String eyesColor;
	Cat(String name, String eyesColor){
		super(name);this.eyesColor = eyesColor;
	}
	
	public void enjoy(){
		System.out.println("猫叫声......");
	}
}

class Dog extends Animal{
	public String furColor;
	Dog(String name, String furColor){
		super(name);this.furColor = furColor; 
	}
	
	public void enjoy(){
		System.out.println("狗叫声......");
	}
}

/*class Bird extends Animal{
	private String featherColor;
	Bird(String name, String featherColor){
		super(name);this.featherColor = featherColor;
	}
	
	public void enjoy(){
		System.out.println("鸟叫声......");
	}
}
*/

class Lady{
	private String name;
	private Animal pet;
	Lady(String name, Animal pet){
		this.name = name; this.pet = pet;
	}
	
	public void myPetEnjoy(){
		pet.enjoy();
	}
}

public class TestPolymoph{
	public static void main(String args[]){
		Cat c = new Cat("catname","blue");
		Dog d = new Dog("dogname","yellow");
		//Bird b = new Bird("birdname","black");
		Lady l1 = new Lady("l1",c);
		Lady l2 = new Lady("l2",d);
		//Lady l3 = new Lady("l3",b);
		l1.myPetEnjoy();
		l2.myPetEnjoy();
		//l3.myPetEnjoy();
	}
}