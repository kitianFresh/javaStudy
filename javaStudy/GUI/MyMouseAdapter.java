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
...Adapter类的使用比Listener接口更方便，因为接口每次实现都需要重写接口中的所有抽象方法，但是类的继承不需要
因此使用类的继承可以只重写想要重写的方法
****/
class Monitor extends MouseAdapter {	
	public void mousePressed(MouseEvent e){
		PointFrame pf = (PointFrame)e.getSource();//Returns:The object on which the Event initially occurred.
		pf.addPoint(new Point(e.getX(),e.getY()));
		pf.repaint();
	}
}