public class TestSync implements Runnable{
	Timer timer = new Timer();
	public static void main(String args[]){
		TestSync test = new TestSync();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	public void run(){
		timer.add(Thread.currentThread().getName());
	}
}

class Timer {
	private static int num = 0;
	public void add(String name){
		//synchronized(this){    //没有同步，将导致num的数目不正常
			num++;
			try{Thread.sleep(1);}catch(Exception e){}
			System.out.println(name+", 你是第"+num+"个使用timer的线程");
		//}
	}
}
