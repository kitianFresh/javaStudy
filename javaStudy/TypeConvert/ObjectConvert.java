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
		//c = d;//�޷���ֵ��Ҳ����ǿ��ת��
		/*r instanceof class ���ص���rʵ����ָ�Ķ����Ƿ���class�࣬r������class���Լ��������򷵻�true*/
		System.out.println(a instanceof Animal);//true
		System.out.println(c instanceof Animal);//true
		System.out.println(d instanceof Animal);//true
		System.out.println(a instanceof Cat);//false
		
		a = new Dog("bigyellow","yellow");
		System.out.println(a.name);
		//System.out.println(a.furColor);//�ٴ���,a��Ȼ��ָ����Dog���󣬵�a��������Dog�̳и���Ĳ��֣�������Dog�������Ժͷ���
											//��Ϊ�����������ò��ܷ�������������Ա
		System.out.println(a instanceof Animal);//true
		System.out.println(a instanceof Dog);//true
		Dog d1 = (Dog)a;//�������ø��������ø�ֵ������ǿ��ת��Ϊ��������
		System.out.println(d1.furColor);
		
		Animal a1 = c;//�������ø��������ø�ֵ������ֱ�Ӹ�ֵ(��ʽת��)Ҳ����ǿ��ת��Animal a1 = (Animal)c;
		System.out.println(a1.name);
		//System.out.println(a1.eyesColor);//����ͬ��
	}
}