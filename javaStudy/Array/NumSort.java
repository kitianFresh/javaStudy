public class NumSort{
	public static void main(String args[]){
		int[] s = new int[args.length];
		
		for(int i=0;i<args.length;i++){
			s[i] = Integer.parseInt(args[i]);
		}
		print(s);
		bubbleSort(s);
		//selectionSort(s);
		print(s);
	}
	private static void bubbleSort(int[] a){
		int i,j,temp;
		for(i=a.length-1;i>=1;i--){
			for(j=0;j<=i-1;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	private static void selectionSort(int[] a){
		int i,j,k,temp;
		for(i=0;i<a.length;i++){
			k = i;//记录当前较小值的位置
			for(j=k+1;j<a.length;j++){
				if(a[j]<a[k]){
					k = j;
				}
			}
			if(k!=1){
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}
	private  static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}
}
