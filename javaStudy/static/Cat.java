public class Cat{
	private static int sid = 0;
	private String name;
	private int id;
	Cat(String name){
		this.name = name;
		id = sid++;
	}
	
	public void info(){
		System.out.println("my name is "+name+" No."+id);
	}
	
	public static void main(String args[]){
		Cat.sid = 100;
		Cat mimi = new Cat("mimi");
		Cat bibi = new Cat("bibi");
		mimi.info();
		bibi.info();
	}
}