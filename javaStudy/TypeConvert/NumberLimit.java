public class NumberLimit{
	public static void main(String arg[]){
		System.out.println("char MAX_VALUE "+Character. MAX_VALUE);//char属于非数值类型故是无符号的，最大0xffff，Unicode码是？
		System.out.println("char MIN_VALUE "+Character. MIN_VALUE);//最小0x0000
		
		System.out.println("byte MAX_VALUE "+Byte.MAX_VALUE);//2^7-1
		System.out.println("byte MIN_VALUE "+Byte. MIN_VALUE);//-2^7
		
		System.out.println("short MAX_VALUE "+Short.MAX_VALUE);//2^15-1
		System.out.println("short MIN_VALUE "+Short.MIN_VALUE);//-2^15
		System.out.println("int MAX_VALUE "+Integer.MAX_VALUE);//2^31-1
		System.out.println("int MIN_VALUE "+Integer.MIN_VALUE);//-2^31
		System.out.println("long MAX_VALUE "+Long.MAX_VALUE);//2^63-1
		System.out.println("long MIN_VALUE "+Long.MIN_VALUE);//-2^63
		
		System.out.println("float MAX_VALUE "+Float.MAX_VALUE);//(2-2^-23)*2^127
		System.out.println("float MIN_VALUE "+Float.MIN_VALUE);//2^-23*2^-126
		System.out.println("double MAX_VALUE "+Double.MAX_VALUE);//(2-2^-52)*2^1023
		System.out.println("double MIN_VALUE "+Double.MIN_VALUE);//2^-52*2^-1022
		//float ff = 3.4028236E38f;//浮点数过大
		float ff = -3.4028235E38f;//
		double dd = 1.7976931348623158E308;//不报错？？？但是比1.7976931348623157E308大一点
											//1.7976931348623159E308才开始报错
		System.out.println(ff);
		System.out.println(dd);//打印出来的dd是1.7976931348623157E308
	}
}
