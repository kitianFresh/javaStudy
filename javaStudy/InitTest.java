public class InitTest {
	byte uninit_byte;
	char uninit_char;
	short uninit_short;
	int uninit_int;
	long uninit_long;
	float uninit_float;
	double uninit_double;
	int[] arr = new int[5];
	Math m ;
	public static void main(String[] args){
		InitTest initTest = new InitTest();
		System.out.println("uninit_byte: "+initTest.uninit_byte);
		System.out.println("uninit_char: "+initTest.uninit_char);
		System.out.println("uinit_short: "+initTest.uninit_short);
		System.out.println("uninit_int: "+initTest.uninit_int);
		System.out.println("uninit_long: "+initTest.uninit_long);
		System.out.println("uninit_float: "+initTest.uninit_float);
		System.out.println("uninit_double: "+initTest.uninit_double);
		System.out.println("uninit_reference: "+initTest.m);
		for(int i=0;i<5;i++){
			System.out.print("\t"+initTest.arr[i]);
		}
		System.out.println();
	}
	
	public void uninit(){
	
	}
	
}