/*******

Exception：
	1．可以是可被控制(checked) 或不可控制的(unchecked)。
	2．表示一个由程序员导致的错误。
	3．应该在应用程序级被处理。

Error：
	1．总是不可控制的(unchecked)。
	2．经常用来用于表示系统错误或低层资源的错误如JVM。
	3．如何可能的话，应该在系统级被捕捉。

Exception分类图
	
五个关键字 	throw throws     //用于抛出异常
			try catch finally//用于捕获处理异常
		   
		   throw用于直接抛出定义的异常类 eg：throw new myException()
		   throws用于声明一个函数可以抛出异常，多个异常用逗号隔开 eg:function() throws Ex1[,Ex2]{}
		   
		   try{可能发生异常的代码}
		   catch(Ex e){处理异常的代码}
		   catch(Ex e){}
		   .......
		   finally{为异常处理提供统一的出口，且finally后面的代码不会再执行了，不管异常是否发生，都必须执行的代码，如关闭打开的文件，删除临时文件}
		   
		   注意：
				1.覆盖父类某方法的子类方法不能抛出比父类方法更多的异常，所以，有时设计父类的方法时会声明
				抛出异常，但实际的实现方法的代码却并不抛出异常，这样做的目的就是为了方便子类方法覆盖父类
				方法时可以抛出异常。
				2.try块中发生异常之后的代码句不会再执行，如果异常被捕获处理，则try catch 语句块执行完之后
				的语句还可以再执行，因为这里的try catch语句块相当于一个正常的程序一部分了，
			try{
				try{
					try{
					
					}catch
				}catch
			}catch嵌套结构，被内层捕获的Exception不会再被外层再捕获。
*******/
import java.io.*;
public class TestEx {
	public static void main(String args[]){
	/*
	int[] array = {1,2,3};
	System.out.println(array[4]);//可以不捕获的RuntimeException，ArrayIndexOutofBoundsException,有JVM捕获
	*/
	
	/*
	try{
		System.out.println(2/0);//ArithmeticException,由程序员捕获处理
	}catch(ArithmeticException e){
		System.out.println("系统出错");
		e.printStackTrace();
	}
	*/
	
	/*
	try{
		TestEx te = new TestEx();
		te.m(0);
	}catch(ArithmeticException e){
		System.out.println("系统出错");
		e.printStackTrace();
	}

	System.out.println("我是try catch 语句块之后的语句，我可以被执行");
	*/
	
	/*
	FileInputStream in = null;
	try{
		//in = new FileInputStream("myFile.txt");//必须有程序员捕获处理FileNotFoundException
		int b;
		b = in.read();//必须有程序员捕获处理IOException
		while(b!=1){
			System.out.println((char)b);
			b = in.read();
		}
	}catch (FileNotFoundException e){
		e.printStackTrace();//子类异常捕获之后，父类异常便不再捕获这个子类异常了
	}catch (IOException e){
		System.out.println(e.getMessage());
	}finally{
		try{
			in.close();//因为in是空指针，所以发生空指针异常
		}catch (IOException e){
			e.printStackTrace();
		}catch (NullPointerException e){
			//e.printStackTrace();
			System.out.println("我在finally语句块中又捕获了NullPointerException");
		}
		System.out.println("我是finally最后一句代码");
	}
	*/
	
	try{
		TestEx te = new TestEx();
		te.m(1);
	}catch(ArithmeticException e){
		System.out.println("系统出错");
		e.printStackTrace();
	}finally{
		System.out.println("finally");
	}
	System.out.println("我是try catch finally语句块之后的语句，我还会再被执行");
	/*
		TestEx te = new TestEx();
		te.m(0);
	*/

	
	try{
		try{
			try{
				System.out.println(2/0);
			}catch(Exception e){
				System.out.println("我是最内层0 try块捕获的Exception");
			}
		}catch(Exception e){
			System.out.println("我是最中层1 try块捕获的Exception");
		}
	}catch(Exception e){
		System.out.println("我是最外层2 try块捕获的Exception");
	}
	
	}
	public void m(int i)throws ArithmeticException{
		if(i==0){
			throw new ArithmeticException("被除数为0");
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