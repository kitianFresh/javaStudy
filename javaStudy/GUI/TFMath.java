import java.awt.*;
import java.awt.event.*;
public class TFMath {
	public static void main(String args[]){
		new TFFrame().launchFrame();
	}
}

class TFFrame extends Frame {
		TextField num1,num2,num3;
		Label lbPlus;
		Button btEqual;
	public void launchFrame(){	
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		lbPlus = new Label("+");
		btEqual = new Button("=");
		//btEqual.addActionListener(new myMonitor(this));
		btEqual.addActionListener(new myMonitor());
		setLayout(new FlowLayout());
		add(num1);
		add(lbPlus);
		add(num2);
		add(btEqual);
		add(num3);
		pack();
		setVisible(true);
	}
	
	/******
	设计模式 内部类 
	好处：
	方便的访问包装类的成员
	防止其他类访问自己独有的监听器类
	使用：
	该类不允许或不需要其他类进行访问时使用
	*******/
	class myMonitor implements ActionListener {
		public void actionPerformed(ActionEvent e){	
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
		}
	}	
}


/******设计模式 持有对方对象引用从而管理对象的所有成员，相当于管理器的设计模式*******/
/*
class myMonitor implements ActionListener {
	TFFrame tf = null;
	
	public myMonitor(TFFrame tf){
		this.tf = tf;
	}
	
	public void actionPerformed(ActionEvent e){	
		int n1 = Integer.parseInt(tf.num1.getText());
		int n2 = Integer.parseInt(tf.num2.getText());
		tf.num3.setText(""+(n1+n2));
	}
}
*/