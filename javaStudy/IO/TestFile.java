/******
java 中文件路径的写法。为了提高可移植性，
java中定义了一个分隔符File.separtor来表示windows下的“\”和Linux下的“/”
第二种方法是统一写正斜杠“/”
******/
import java.io.*;
public class TestFile {
	static int deep = 0;
	public static void main(String args[]){
		String separator = File.separator;
		String filename = "myfile.txt";//注意：找的上层路径是指该类运行时所在最上层包所在的路径
		String directory = "mydir1"+separator+"mydir2";
		//String directory = "mydir1/mydir2";
		File f = new File(directory,filename);
		if(f.exists()){
			System.out.println("文件名："+f.getAbsolutePath());
			System.out.println("文件大小："+f.length());
		}
		else{
			f.getParentFile().mkdirs();
			try{
				f.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		File ff = new File("d:/javastudy");
		//mylistFiles(ff);
		mylistFiles(ff,0);
	}
	
	
	public static void mylistFiles(File f){
		
		
		File[] childfiles = f.listFiles();
		for(int i=0;i<childfiles.length;i++){
			for(int j =0;j<deep;j++){
				System.out.print("   ");
			}
			System.out.println(childfiles[i].getName());
			if(childfiles[i].isDirectory()){
				deep++;
				mylistFiles(childfiles[i]);
			}
		}
		deep--;
	}
	
	public static void mylistFiles(File f,int level){
		
		
		File[] childfiles = f.listFiles();
		for(int i=0;i<childfiles.length;i++){
			for(int j =0;j<level;j++){
				System.out.print("   ");
			}
			System.out.println(childfiles[i].getName());
			if(childfiles[i].isDirectory()){
				mylistFiles(childfiles[i],level+1);//这里不要用level++，想想为什么；
			}                                      //因为用level++等价于level=level+1，改变了level在本层次的值
		}
	}
}