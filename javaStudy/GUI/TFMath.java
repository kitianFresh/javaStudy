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
	���ģʽ �ڲ��� 
	�ô���
	����ķ��ʰ�װ��ĳ�Ա
	��ֹ����������Լ����еļ�������
	ʹ�ã�
	���಻�������Ҫ��������з���ʱʹ��
	*******/
	class myMonitor implements ActionListener {
		public void actionPerformed(ActionEvent e){	
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
		}
	}	
}


/******���ģʽ ���жԷ��������ôӶ������������г�Ա���൱�ڹ����������ģʽ*******/
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