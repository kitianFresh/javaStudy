public class TestConvert{
	public static void main(String arg[]){
		int i1=123;
		int i2=456;
		double d1=(i1+i2)*1.2; //ϵͳ��(i1+i2)ת��Ϊdouble������
		float f1=(float)((i1+i2)*1.2);//��Ҫ��ǿ��ת���������ܻ����
		byte b1=67;
		byte b2=89;
		byte b3=(byte)(b1+b2);//ϵͳ����b1+b2��ת��Ϊint�����㣬����Ҫǿ��ת��
		System.out.println(b3);
		
		double d2=1e200;
		float f2=(float)d2;//�������
		System.out.println(f2);
		
		//float f3=1.23;//�������
		float f3=1.23f;//1.23 Ĭ��Ϊdouble���ʼ���f��׺
		long l1=123;
		long l2=300000000000L;//300000000000������int�ķ�Χ����Ҫ��l��׺
		float f=l1*l2*f3;//ϵͳ��ת��Ϊfloat������
		long l=(long)f;//ǿ��ת������ȥС�����֣������������룩,���;���
	}
}
/*********�ܽ�************/
/*
1.��ʽת����
	ϵͳ��������У�����С�����������ת��
		byte char short ->int ->long ->float ->double
		byte char short ֮�䲻�ụ��ת������������֮������ʱ���Ȼ�ת��Ϊint����
	��������������Ĭ��Ϊint��С��Ĭ��Ϊdouble

2.ǿ��ת��
	�������������С��ת��ʱ�������ǿ��ת�������Ҵ�ʱ���ܻ����������߾��ȵĽ���
		
		����long ->int ,ֱ�ӿ����ĸ��ֽڼ��ɣ���ˣ����long����ı�ʾ��δ����int�ķ�Χ���������������long�����������int��Χ�Ļ����ͻ����
		����double ->float,���ڱ�ʾ��ʽ�����Ͳ�һ���������ǽص�һ���֣����Դ˹��̺����ײ���������߾��Ƚ���

3.��׺��ʾ
	����float ��longʱҪע���f��l
	��float f=1.23f��float f=(float)1.23����һ����ǰ���ڼ�����оʹ��˸�float���͵�1.23�����Ǻ���ʵ������doubleת��������
*/