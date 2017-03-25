package tw.org.iii;

//介面及類別間的溝通

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

//宣告本類別實作MouseListener介面
//public class MyPainter extends JPanel implements MouseListener{
	//因為JPanel有無傳參數建構式，所以沒有內容也不會有錯誤
  public class MyPainter extends JPanel 
  {
	private int x0,x1,y0,y1,x,y,w,h;
	
	//現在交給mymouseAdapter來監測滑鼠動態，所以不用實作見面
	//在類別中，宣告另一個類別物件，以達到類別與類別通訊的目的
	private MymouseAdapter mymouseAdapter;
	
	MyPainter()
	{
		//設定背景，加入Color class。其中yellow為static，所以可以直接用該類別的屬性而不用建立物件(color.yellow)
		setBackground(Color.yellow);
		
		//本類別物件自己監測滑鼠動態
//		addMouseListener(this);
		
		//本類別(this)的屬性及方法傳給另一個類別
		mymouseAdapter = new MymouseAdapter(this);
		addMouseListener(mymouseAdapter);
		
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
	
	void setX0(int x0)
	{
		this.x0 = x0;
	}
	
	int getY0()
	{
		return y0;
	}
	
	void setY0(int y0)
	{
		this.y0 = y0;
	}
	
	void changeLine(int x1, int y1)
	{
		//畫出圓形計算x,y及長寬
		this.x1 = x1; this.y1 = y1;
		int r = Math.abs(x0-x1);
		w = 2*r;
		h = w;
		x = x0 - r;
		y = y0 - r;
		
		//重新執行paintComponent，repaint通常是放在一個固定週期中，像fps，而不是一個動作就重畫一次
		repaint();
	}
//
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println("Click");
//		
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		
//		
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		
//		
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		x0 = e.getX();
//		y0 = e.getY();
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		x1 = e.getX();
//		y1 = e.getY();
//		
//		//畫出圓形計算x,y及長寬
//		int r = Math.abs(x0-x1);
//		w = 2*r;
//		h = w;
//		x = x0 - r;
//		y = y0 - r;
//		
//		//重新執行paintComponent，repaint通常是放在一個固定週期中，像fps，而不是一個動作就重畫一次
//		repaint();
//	
//	}
}


/*上方是利用實作介面的方式，完成偵測滑鼠動態。但實作介面時，介面所制定的方法皆要實作；
  可以繼承已經有實作的類別，並overwrite其中我們需要的方法。當我們需要實作每一個介面的方法時，可以直接實作介面；
  但如果只需要實作幾個方法，可以繼承已經實作的類別即可。 
*/
class MymouseAdapter extends MouseAdapter //MouseAdapter是抽象類別，但是沒有類別方法，主要是因為其方法內皆是空的，所以就直接將其作為抽象類別。
{
	//宣告另一個類別物件，並在建構式中以該類別物件作為參數，以達到類別與類別的通訊
	private MyPainter painter;
	public MymouseAdapter(MyPainter painter) {
		this.painter = painter;
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		//e.getX及e.getY可以偵測滑鼠的座標，並以此作為參數，傳給.setX0及.setY0更改painter物件裡的x0及y0
		painter.setX0(e.getX());
		painter.setY0(e.getY());
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		//偵側滑鼠放開時的x及y座標，並傳給.changeLine方法
		int x1 = e.getX(); int y1 = e.getY();
		painter.changeLine(x1, y1);
	}
}
