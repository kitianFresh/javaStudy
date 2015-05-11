/***线程的两种使用方法****/
public class TestThread {
	public static void main(String args[]){
		Runner1 r = new Runner1();
		//r.run();注意这样调用和Thread.start()完全不是一回事，这样是Runner1类对象调用run方法
		Thread t = new Thread(r);//实现Runnable接口的类必须要封装成一个线程类才能像线程一样执行
		t.start();
		
		//Runner1 r = new Runner1();
		//r.start();
		for(int i =0;i<100;i++){
			System.out.println("Main Thread:-----"+i);
		}
	}
}
/*不推荐直接使用继承,因为继承之后无法再继承其他类了
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