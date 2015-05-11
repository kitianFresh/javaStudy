class Person {
	private String name;
	private String location;
	Person(String name){
		this.name = name;
		location = "xiangyang";
		System.out.println("调用Person(String name) ");
	}
	
	Person(String name, String location){
		this.name = name;
		this.location = location;
		System.out.println("调用Person(String name, String location) ");
	}
	
	public String info(){
		return "name: "+name+" location: "+location;
	}
}

class Student extends Person {
	private String school;
	Student(String name, String school){
		this(name,"xiangyang", school);//必须是第一句，否则会出错
		System.out.println("调用Student(String name, String school) ");
		
	}
	
	Student(String name,String location, String school){
		super(name,location);
		this.school = school;
		System.out.println("调用Student(String name, String location, String school) ");
	}
	
	public String info(){
		return super.info()+" school: "+school;
	}
}

public class TestInherit{
	public static void main(String[] args){
		Person p1 = new Person("A");
		Person p2 = new Person("B","shanghai");
		Student s1 = new Student("C","s1");
		Student s2 = new Student("C","shanghai","s2");
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
	}
}