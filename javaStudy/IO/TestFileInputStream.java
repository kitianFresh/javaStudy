import java.io.*;
public class TestFileInputStream {
	public static void main(String args[]){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("d:/javastudy/TestFile.java");
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}
		int b = -1;
		long num = 0;
		try{
			while((b = fis.read())!=-1){
				System.out.print((char)b);
				num++;
			}
			fis.close();
			System.out.println();
			System.out.println("����ȡ�� "+num+"�ֽ�");
		}catch(IOException e){
			System.out.println("�ļ���ȡ����");System.exit(-1);
		}
		
	}
}