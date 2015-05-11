public class TestInit {
	public static void main(String args[]){
		//int i = null;//错误，类型不兼容
		String i = null;
		if("".equals(i)){//这是比较一个字符串是否是空字符串的最安全的方法，不要写成i.equals("");
			System.out.println("\"\"==null");
		}
		if(i instanceof String){
			System.out.println("i is an instance of String");
		}
		else{
			System.out.println("i is not an instance of String");
		}
		System.out.println(i);
	}
}