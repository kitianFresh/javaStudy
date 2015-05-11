import java.io.File;

public class FileDir {

	
	private static int deep = 0;
	public static void listFiles(File file){
		for(int i=0;i<deep;i++){
			System.out.print("  ");
		}
		System.out.println(file.getName());
		if(file.isDirectory()){
			File[] files = file.listFiles();
			deep ++; //ÿ����һ��deep++
			for(int i=0;i<files.length;i++){
				listFiles(files[i]);
			}
			deep --; //ÿ�˳�һ��deep--
		}
	}
	public static void main(String[] args) {
		File file = new File(args[0]);
		FileDir.listFiles(file);
	}

}
