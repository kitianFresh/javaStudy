import java.io.*;
public class TestTransformIO {
	public static void main(String args[]){
		try{
			OutputStreamWriter osw = new OutputStreamWriter(
										new FileOutputStream("C:/Users/qitian/Desktop/char.txt"));
			osw.write("microsoftibmsun");//��ΪFileOutputStreamû��ֱ��д�ַ����ķ��������԰�װһ��ת��������
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(
										new FileOutputStream("C:/Users/qitian/Desktop/char.txt",true),"ISO8859_1");
			osw.write("bibibibibibibibi");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch(FileNotFoundException e){
			System.out.println("δ�ҵ��ļ�");
			System.exit(-1);
		}catch(IOException e){
			System.out.println("ϵͳ����");
			System.exit(-1);
		}		
	}
}