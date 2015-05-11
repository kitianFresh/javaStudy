import java.io.*;
public class TestTransformIO {
	public static void main(String args[]){
		try{
			OutputStreamWriter osw = new OutputStreamWriter(
										new FileOutputStream("C:/Users/qitian/Desktop/char.txt"));
			osw.write("microsoftibmsun");//因为FileOutputStream没有直接写字符串的方法，所以包装一个转换流即可
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(
										new FileOutputStream("C:/Users/qitian/Desktop/char.txt",true),"ISO8859_1");
			osw.write("bibibibibibibibi");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch(FileNotFoundException e){
			System.out.println("未找到文件");
			System.exit(-1);
		}catch(IOException e){
			System.out.println("系统出错");
			System.exit(-1);
		}		
	}
}