public class TestInit {
	public static void main(String args[]){
		//int i = null;//�������Ͳ�����
		String i = null;
		if("".equals(i)){//���ǱȽ�һ���ַ����Ƿ��ǿ��ַ������ȫ�ķ�������Ҫд��i.equals("");
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