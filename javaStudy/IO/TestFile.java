/******
java ���ļ�·����д����Ϊ����߿���ֲ�ԣ�
java�ж�����һ���ָ���File.separtor����ʾwindows�µġ�\����Linux�µġ�/��
�ڶ��ַ�����ͳһд��б�ܡ�/��
******/
import java.io.*;
public class TestFile {
	static int deep = 0;
	public static void main(String args[]){
		String separator = File.separator;
		String filename = "myfile.txt";//ע�⣺�ҵ��ϲ�·����ָ��������ʱ�������ϲ�����ڵ�·��
		String directory = "mydir1"+separator+"mydir2";
		//String directory = "mydir1/mydir2";
		File f = new File(directory,filename);
		if(f.exists()){
			System.out.println("�ļ�����"+f.getAbsolutePath());
			System.out.println("�ļ���С��"+f.length());
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
				mylistFiles(childfiles[i],level+1);//���ﲻҪ��level++������Ϊʲô��
			}                                      //��Ϊ��level++�ȼ���level=level+1���ı���level�ڱ���ε�ֵ
		}
	}
}