/**
��̬�ܺõ�ʵ���˳������չ�Զ�����ÿ�ζ����жϣ�
��̬���ڳ������й����У������ڱ���׶Σ�����̬���ж϶�������ʵ����ָ����������������Ӧ�ķ���
��̬������Ҫ�㣺1.�̳�
				2.��д
				3.��������ָ���������//����д����һ�ֺܺõķ������߳���Ŀ���չ��
**/
class Animal{
	public String name;
	Animal(String name){
		this.name = name;
	}
	
	public void enjoy(){
		System.out.println("����......");
	}
	
	//abstract public void enjoy(){}�����󷽷������������Ϊ������abstract class
}

class Cat extends Animal{
	public String eyesColor;
	Cat(String name, String eyesColor){
		super(name);this.eyesColor = eyesColor;
	}
	
	public void enjoy(){
		System.out.println("è����......");
	}
}

class Dog extends Animal{
	public String furColor;
	Dog(String name, String furColor){
		super(name);this.furColor = furColor; 
	}
	
	public void enjoy(){
		System.out.println("������......");
	}
}

/*class Bird extends Animal{
	private String featherColor;
	Bird(String name, String featherColor){
		super(name);this.featherColor = featherColor;
	}
	
	public void enjoy(){
		System.out.println("�����......");
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