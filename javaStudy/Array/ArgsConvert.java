public class ArgsConvert {
	public static void main(String args[]){
	//ע���쳣����
		String[] sFirst = args[0].split(";");
		for(int i=0;i<sFirst.length;i++){
			System.out.println(sFirst[i]);
		}
		String[] sSecond ;
		double[][] dd = new double[sFirst.length][];
		/*
		for(int i=0;i<sFirst.length;i++){
		System.out.println(ss[i].length+"=========");
			for(int j=0;j<ss[i].length;j++){
				System.out.println(ss[i][j]);
			}
		}
		*/
		for(int i=0;i<sFirst.length;i++){
			sSecond = sFirst[i].split(",");
			dd[i] = new double[sSecond.length];//һ��Ҫע���ȶ�һ�����ø�ֵ�����ܶԶ������ø�ֵ
			for(int j=0;j<sSecond.length;j++){
				dd[i][j] = Double.parseDouble(sSecond[j]);
			}
		}
		
		for(int i=0;i<dd.length;i++){
			for(int j=0;j<dd[i].length;j++){
				System.out.println(dd[i][j]);
			}
		}
	}
} 