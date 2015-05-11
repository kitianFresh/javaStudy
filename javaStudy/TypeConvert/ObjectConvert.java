class Animal{
	public String name;
	Animal(String name){
		this.name = name;
	}
}

class Cat extends Animal{
	public String eyesColor;
	Cat(String name, String eyesColor){
		super(name);this.eyesColor = eyesColor;
	}
}

class Dog extends Animal{
	public String furColor;
	Dog(String name, String furColor){
		super(name);this.furColor = furColor; 
	}
}

public class ObjectConvert{
	public static void main(String args[]){
		Animal a = new Animal("animal");
		Cat c = new Cat("catname","blue");
		Dog d = new Dog("dogname","black");
		//c = d;//无法赋值，也不能强制转换
		/*r instanceof class 返回的是r实际所指的对象是否是class类，r若果是class类以及其子类则返回true*/
		System.out.println(a instanceof Animal);//true
		System.out.println(c instanceof Animal);//true
		System.out.println(d instanceof Animal);//true
		System.out.println(a instanceof Cat);//false
		
		a = new Dog("bigyellow","yellow");
		System.out.println(a.name);
		//System.out.println(a.furColor);//①错误,a虽然是指向了Dog对象，但a并看不到Dog继承父类的部分，看不到Dog新增属性和方法
											//因为父类对象的引用不能访问子类新增成员
		System.out.println(a instanceof Animal);//true
		System.out.println(a instanceof Dog);//true
		Dog d1 = (Dog)a;//父类引用给子类引用赋值，必须强制转换为子类引用
		System.out.println(d1.furColor);
		
		Animal a1 = c;//子类引用给父类引用赋值，可以直接赋值(隐式转换)也可以强制转换Animal a1 = (Animal)c;
		System.out.println(a1.name);
		//System.out.println(a1.eyesColor);//错误，同①
	}
}