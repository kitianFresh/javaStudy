/*******

Exception��
	1�������ǿɱ�����(checked) �򲻿ɿ��Ƶ�(unchecked)��
	2����ʾһ���ɳ���Ա���µĴ���
	3��Ӧ����Ӧ�ó��򼶱�����

Error��
	1�����ǲ��ɿ��Ƶ�(unchecked)��
	2�������������ڱ�ʾϵͳ�����Ͳ���Դ�Ĵ�����JVM��
	3����ο��ܵĻ���Ӧ����ϵͳ������׽��

Exception����ͼ
	
����ؼ��� 	throw throws     //�����׳��쳣
			try catch finally//���ڲ������쳣
		   
		   throw����ֱ���׳�������쳣�� eg��throw new myException()
		   throws��������һ�����������׳��쳣������쳣�ö��Ÿ��� eg:function() throws Ex1[,Ex2]{}
		   
		   try{���ܷ����쳣�Ĵ���}
		   catch(Ex e){�����쳣�Ĵ���}
		   catch(Ex e){}
		   .......
		   finally{Ϊ�쳣�����ṩͳһ�ĳ��ڣ���finally����Ĵ��벻����ִ���ˣ������쳣�Ƿ�����������ִ�еĴ��룬��رմ򿪵��ļ���ɾ����ʱ�ļ�}
		   
		   ע�⣺
				1.���Ǹ���ĳ���������෽�������׳��ȸ��෽��������쳣�����ԣ���ʱ��Ƹ���ķ���ʱ������
				�׳��쳣����ʵ�ʵ�ʵ�ַ����Ĵ���ȴ�����׳��쳣����������Ŀ�ľ���Ϊ�˷������෽�����Ǹ���
				����ʱ�����׳��쳣��
				2.try���з����쳣֮��Ĵ���䲻����ִ�У�����쳣����������try catch ����ִ����֮��
				����仹������ִ�У���Ϊ�����try catch�����൱��һ�������ĳ���һ�����ˣ�
			try{
				try{
					try{
					
					}catch
				}catch
			}catchǶ�׽ṹ�����ڲ㲶���Exception�����ٱ�����ٲ���
*******/
import java.io.*;
public class TestEx {
	public static void main(String args[]){
	/*
	int[] array = {1,2,3};
	System.out.println(array[4]);//���Բ������RuntimeException��ArrayIndexOutofBoundsException,��JVM����
	*/
	
	/*
	try{
		System.out.println(2/0);//ArithmeticException,�ɳ���Ա������
	}catch(ArithmeticException e){
		System.out.println("ϵͳ����");
		e.printStackTrace();
	}
	*/
	
	/*
	try{
		TestEx te = new TestEx();
		te.m(0);
	}catch(ArithmeticException e){
		System.out.println("ϵͳ����");
		e.printStackTrace();
	}

	System.out.println("����try catch ����֮�����䣬�ҿ��Ա�ִ��");
	*/
	
	/*
	FileInputStream in = null;
	try{
		//in = new FileInputStream("myFile.txt");//�����г���Ա������FileNotFoundException
		int b;
		b = in.read();//�����г���Ա������IOException
		while(b!=1){
			System.out.println((char)b);
			b = in.read();
		}
	}catch (FileNotFoundException e){
		e.printStackTrace();//�����쳣����֮�󣬸����쳣�㲻�ٲ�����������쳣��
	}catch (IOException e){
		System.out.println(e.getMessage());
	}finally{
		try{
			in.close();//��Ϊin�ǿ�ָ�룬���Է�����ָ���쳣
		}catch (IOException e){
			e.printStackTrace();
		}catch (NullPointerException e){
			//e.printStackTrace();
			System.out.println("����finally�������ֲ�����NullPointerException");
		}
		System.out.println("����finally���һ�����");
	}
	*/
	
	try{
		TestEx te = new TestEx();
		te.m(1);
	}catch(ArithmeticException e){
		System.out.println("ϵͳ����");
		e.printStackTrace();
	}finally{
		System.out.println("finally");
	}
	System.out.println("����try catch finally����֮�����䣬�һ����ٱ�ִ��");
	/*
		TestEx te = new TestEx();
		te.m(0);
	*/

	
	try{
		try{
			try{
				System.out.println(2/0);
			}catch(Exception e){
				System.out.println("�������ڲ�0 try�鲶���Exception");
			}
		}catch(Exception e){
			System.out.println("�������в�1 try�鲶���Exception");
		}
	}catch(Exception e){
		System.out.println("���������2 try�鲶���Exception");
	}
	
	}
	public void m(int i)throws ArithmeticException{
		if(i==0){
			throw new ArithmeticException("������Ϊ0");
		}
	}
	
	public void f() throws FileNotFoundException,IOException{
		FileInputStream in = new FileInputStream("myFile.txt");
		int b;
		b = in.read();
		while(b!=1){
			System.out.println((char)b);
			b = in.read();
		}
	}
}