/***�̵߳�����ʹ�÷���****/
public class TestThread {
	public static void main(String args[]){
		Runner1 r = new Runner1();
		//r.run();ע���������ú�Thread.start()��ȫ����һ���£�������Runner1��������run����
		Thread t = new Thread(r);//ʵ��Runnable�ӿڵ������Ҫ��װ��һ���߳���������߳�һ��ִ��
		t.start();
		
		//Runner1 r = new Runner1();
		//r.start();
		for(int i =0;i<100;i++){
			System.out.println("Main Thread:-----"+i);
		}
	}
}
/*���Ƽ�ֱ��ʹ�ü̳�,��Ϊ�̳�֮���޷��ټ̳���������
class Runner1 extends Thread {
	public void run(){	
		for(int i =0;i<100;i++){
			System.out.println("Runner1: "+i);
		}
	}
}
*/
class Runner1 implements Runnable {
	public void run(){	
		for(int i =0;i<100;i++){
			System.out.println("Runner1: "+i);
		}
	}
}