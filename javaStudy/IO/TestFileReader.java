import java.io.*;
public class TestFileReader {
	public static void main(String args[]){
		FileReader fis = null;
		try{
			fis = new FileReader("d:/javastudy/TestFile.java");
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}
		int c = -1;
		long num = 0;
		try{
			while((c = fis.read())!=-1){
				System.out.print((char)c);
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