public class NumberLimit{
	public static void main(String arg[]){
		System.out.println("char MAX_VALUE "+Character. MAX_VALUE);//char���ڷ���ֵ���͹����޷��ŵģ����0xffff��Unicode���ǣ�
		System.out.println("char MIN_VALUE "+Character. MIN_VALUE);//��С0x0000
		
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
		//float ff = 3.4028236E38f;//����������
		float ff = -3.4028235E38f;//
		double dd = 1.7976931348623158E308;//�������������Ǳ�1.7976931348623157E308��һ��
											//1.7976931348623159E308�ſ�ʼ����
		System.out.println(ff);
		System.out.println(dd);//��ӡ������dd��1.7976931348623157E308
	}
}
