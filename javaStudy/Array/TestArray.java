/******
java�е����鶼���࣬�����е�Ԫ�ض��Ƕ�������ã����˻�������֮�⣩��
��ˣ��������ʹ�ø�ֵ֮ǰ��Ҫ������ռ�
*****/

public class TestArray{
	public static void main(String args[]){
		int a[] = {1,2,3};//�൱��int a[] = new int[]{1,2,3}��̬��ʼ���������ͬʱ��ֵ
		//Date[] days = new Date[]{new Date(2015,2,1),new Date(2015,2,2),new Date(2015,2,3)}
		Date[] days;//��̬��ʼ��
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