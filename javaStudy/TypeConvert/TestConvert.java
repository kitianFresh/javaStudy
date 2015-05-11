public class TestConvert{
	public static void main(String arg[]){
		int i1=123;
		int i2=456;
		double d1=(i1+i2)*1.2; //系统将(i1+i2)转换为double型运算
		float f1=(float)((i1+i2)*1.2);//需要加强制转换符，可能会溢出
		byte b1=67;
		byte b2=89;
		byte b3=(byte)(b1+b2);//系统将（b1+b2）转换为int型运算，故需要强制转换
		System.out.println(b3);
		
		double d2=1e200;
		float f2=(float)d2;//产生溢出
		System.out.println(f2);
		
		//float f3=1.23;//编译错误
		float f3=1.23f;//1.23 默认为double，故加上f后缀
		long l1=123;
		long l2=300000000000L;//300000000000超出了int的范围，故要加l后缀
		float f=l1*l2*f3;//系统将转换为float型运算
		long l=(long)f;//强制转换会舍去小数部分（不是四舍五入）,降低精度
	}
}
/*********总结************/
/*
1.隐式转换：
	系统运算过程中，容量小的向容量大的转换
		byte char short ->int ->long ->float ->double
		byte char short 之间不会互相转换，他们三者之间运算时首先会转换为int类型
	声明过程中整数默认为int，小数默认为double

2.强制转换
	容量大的向容量小的转换时，必须加强制转换符，且此时可能会产生溢出或者精度的降低
		
		对于long ->int ,直接砍掉四个字节即可（因此，如果long本身的表示并未超过int的范围，并不会出错；但是long本身如果超过int范围的话，就会出错）
		对于double ->float,由于表示方式和整型不一样，并不是截掉一部分，所以此过程很容易产生溢出或者精度降低

3.后缀表示
	声明float 和long时要注意加f和l
	且float f=1.23f和float f=(float)1.23并不一样，前者在计算机中就存了个float类型的1.23，但是后者实际上由double转换过来的
*/