public class TestPandC {
	public static void main(String[] args){
		SyncStack ss = new SyncStack();
		Producer p = new Producer(ss);
		Consumer c = new Consumer(ss);
		Thread tp = new Thread(p);
		Thread tc = new Thread(c);
		tp.start();tc.start();
	}
}

class Bread {
	int id;
	Bread(int id){
		this.id = id;
	}
	public String toString(){
		return "Bread: "+id;
	}
}

class SyncStack {
	int index = 0;
	Bread[] breads = new Bread[6];
	public synchronized void push(Bread b) {
		if(index == breads.length){//注意只能用while不能用if；因为wait会异常
			try{
				this.wait();//访问当前对象的线程wait()
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();
		breads[index] = b;
		index++;
		System.out.println("生产了："+b);
	}
	
	public synchronized Bread pop(){
		if(index == 0){
			try{
				this.wait();//wait的时候锁已经不归该线程所有，但是sleep还有锁
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();//叫醒一个正在该对象上wait的一个线程
		index--;
		System.out.println("消费了："+breads[index]);
		return breads[index];	
	}
}

class Producer implements Runnable {
	SyncStack ss = null;
	Producer(SyncStack ss){
		this.ss = ss;
	}
	
	public void run(){
		for(int i=0;i<20;i++){
			Bread b = new Bread(i);
			ss.push(b);
			//System.out.println("生产了："+b);
			try{
				Thread.sleep((int)Math.random()*1000);
			}catch(InterruptedException e){	
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	SyncStack ss = null;
	Consumer(SyncStack ss){
		this.ss = ss;
	}
	
	public void run(){
		for(int i=0;i<20;i++){
			Bread b = null;
			b = ss.pop();
			//System.out.println("消费了："+breads[index]);//放到这里用if的话会出问题，先打出消费0，再打出生产0
			try{
				Thread.sleep((int)Math.random()*1000);
			}catch(InterruptedException e){	
				e.printStackTrace();
			}
		}
	}
}