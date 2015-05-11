import java.io.*;
public class TestFileInputStream {
	public static void main(String args[]){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("d:/javastudy/TestFile.java");
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("找不到指定文件");
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
			System.out.println("共读取了 "+num+"字节");
		}catch(IOException e){
			System.out.println("文件读取错误");System.exit(-1);
		}
		
	}
}