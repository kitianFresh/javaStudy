enum student{
	A(111),
	B(222),
	C(333);
	private int num;
	
	student(int num){
		this.num=num;
		System.out.println("ִ�й����췽��");
	}
	int getnum(){
		return num;
	}
}
	public class EnumTest {
	public static void main(String[] args) {
	// TODO Auto-generated method stub\
		System.out.println(student.A.getnum());
	}
}
