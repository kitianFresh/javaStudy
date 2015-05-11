public class ArgsConvert {
	public static void main(String args[]){
	//注意异常处理
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
			dd[i] = new double[sSecond.length];//一定要注意先对一级引用赋值，才能对二级引用赋值
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