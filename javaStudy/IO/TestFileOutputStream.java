import java.io.*;
public class TestFileOutputStream{
	public static void main(String args[]){
		int b = 0;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream("C:/Users/qitian/Desktop/�½��ı��ĵ�.txt");
			fos = new FileOutputStream("C:/Users/qitian/Desktop/tq.txt");
			while((b=fis.read())!=-1){
				fos.write(b);
			}
			fis.close();
			fos.close();
		}catch(FileNotFoundException e){
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}catch(IOException e){
			System.out.println("ϵͳ����");
			System.exit(-1);
		}
		System.out.println("���Ƴɹ�");
	}
}