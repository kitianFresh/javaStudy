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
		if(index == breads.length){//ע��ֻ����while������if����Ϊwait���쳣
			try{
				this.wait();//���ʵ�ǰ������߳�wait()
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();
		breads[index] = b;
		index++;
		System.out.println("�����ˣ�"+b);
	}
	
	public synchronized Bread pop(){
		if(index == 0){
			try{
				this.wait();//wait��ʱ�����Ѿ�������߳����У�����sleep������
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();//����һ�����ڸö�����wait��һ���߳�
		index--;
		System.out.println("�����ˣ�"+breads[index]);
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
			//System.out.println("�����ˣ�"+b);
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
			//System.out.println("�����ˣ�"+breads[index]);//�ŵ�������if�Ļ�������⣬�ȴ������0���ٴ������0
			try{
				Thread.sleep((int)Math.random()*1000);
			}catch(InterruptedException e){	
				e.printStackTrace();
			}
		}
	}
}