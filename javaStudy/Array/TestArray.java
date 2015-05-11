/******
java中的数组都是类，数组中的元素都是对象的引用（除了基本数据之外）；
因此，对数组的使用赋值之前都要先申请空间
*****/

public class TestArray{
	public static void main(String args[]){
		int a[] = {1,2,3};//相当于int a[] = new int[]{1,2,3}静态初始化，定义的同时赋值
		//Date[] days = new Date[]{new Date(2015,2,1),new Date(2015,2,2),new Date(2015,2,3)}
		Date[] days;//动态初始化
		days = new Date[3];
		for(int i=0;i<days.length;i++){
			days[i] = new Date(2015,2,i+1);
		}
	}
}

class Date {
	int year;
	int month;
	int day;
	Date(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
}