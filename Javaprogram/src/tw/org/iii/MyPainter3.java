package tw.org.iii;

//內部類別

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

  public class MyPainter3 extends JPanel 
  {
	private int x0,x1,y0,y1,x,y,w,h;
	
	MyPainter3()
	{
		//設定背景，加入Color class。其中yellow為static，所以可以直接用該類別的屬性而不用建立物件(color.yellow)
		setBackground(Color.yellow);
		
		//MouseListener(MouseListener l)需要一個介面(MouseListener)作為參數，而MouseAdapter為實作MouseListner的類別。在此處直接建立MouseAdapter物件，並且在其後方overwrite需要的方法。
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				x0 = e.getX(); y0 = e.getY();
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				x1 = e.getX(); y1 = e.getY();
				int r = Math.abs(x0-x1);
				w = 2*r;
				h = w;
				x = x0 - r;
				y = y0 - r;
				
				//重新執行paintComponent，repaint通常是放在一個固定週期中，像fps，而不是一個動作就重畫一次
				repaint();
				
			}
		});
		
		x0 = x1 = y0 = y1 = -1;
	}

	//此時程式已經將Graphics物件實體傳回，所以不用再建立物件實體。由於使用Javax.swing，而paintComponent屬於jComponent，所以即可載入其物件。
	@Override
	protected void paintComponent(Graphics g) {
		//要overwrite時，先執行父類別的方法，再補足其他條件。否則直接寫新版本比較實在。
		super.paintComponent(g);
		
		//由於paintComponent的參數為Graphics class型別，而調整粗細的.setStroke方法是在Graphics2D中，所以將傳入的g強制轉型為Graphics2D，就可以使用.setStroke
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.blue);
		g2d.drawLine(x0, y0, x1, y1);
		
		//畫出圓形。x及y是左上角的座標，w及h為長及寬。
		g2d.drawOval(x, y, w, h);
//		System.out.println("hello");
		
	}
	
	int getX0()
	{
		return x0;
	}
	
	int getY0()
	{
		return y0;
	}
		
	
}


