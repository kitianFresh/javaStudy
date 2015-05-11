import java.io.*;
public class TestFileWriter{
	public static void main(String args[]){
		/*
		FileWriter fw = null;
		try{
			fw = new FileWriter("C:/Users/qitian/Desktop/tq.txt");
			for(int c =0;c<65535;c++){
				fw.write(c);
			}
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("文件写入错误");
			System.exit(-1);
		}
		System.out.println("字符复制成功");
		*/
		
		FileWriter fw = null;
		FileReader fr = null;
		int b = -1;
		try{
			fr = new FileReader("C:/Users/qitian/Desktop/tq.txt");
			fw = new FileWriter("C:/Users/qitian/Desktop/ttt.txt");
			while((b = fr.read())!=-1){
				fw.write(b);
			}
			fw.close();
			fr.close();
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("文件写入错误");
			System.exit(-1);
		}
		System.out.println("字符复制成功");
	}
}