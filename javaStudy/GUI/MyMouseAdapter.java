import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MyMouseAdapter {
	public static void main(String args[]){
		new PointFrame("myMouseAdapter");
	}
}

class PointFrame extends Frame {
	ArrayList points = null;
	PointFrame(String s){	
		super(s);
		points = new ArrayList();
		setLayout(null);
		setBounds(300,300,400,300);
		this.setBackground(new Color(204,204,255));
		setVisible(true);
		this.addWindowListener(new MyWindowMonitor());
		this.addMouseListener(new Monitor());
	}
	
	public void paint(Graphics g){
		Iterator i = points.iterator();
		while(i.hasNext()){
			Point p = (Point)i.next();
			g.setColor(Color.BLUE);
			g.fillOval(p.x,p.y,10,10);
		}
	}
	
	public void addPoint(Point p){
		points.add(p);
	}
	
	class MyWindowMonitor extends WindowAdapter {
		public void windowClosing(WindowEvent e){	
			setVisible(false);
			System.exit(0);
		}
	}
	/*
	class Monitor extends MouseAdapter {
		public void mousePressed(MouseEvent e){
			addPoint(e.getPoint());
			repaint();
		}
	}
	*/
}
/****
...Adapter���ʹ�ñ�Listener�ӿڸ����㣬��Ϊ�ӿ�ÿ��ʵ�ֶ���Ҫ��д�ӿ��е����г��󷽷���������ļ̳в���Ҫ
���ʹ����ļ̳п���ֻ��д��Ҫ��д�ķ���
****/
class Monitor extends MouseAdapter {	
	public void mousePressed(MouseEvent e){
		PointFrame pf = (PointFrame)e.getSource();//Returns:The object on which the Event initially occurred.
		pf.addPoint(new Point(e.getX(),e.getY()));
		pf.repaint();
	}
}