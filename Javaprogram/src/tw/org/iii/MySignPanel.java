package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MySignPanel extends JPanel{
	//用HashMap接收key為string，value為integer的資料，泛型設為string及value。以此接收x = x value, y = y value的資料。(HashMap<String,Integer>)
	//因為畫線時所產生的點具有順序性，因此用linkedlist儲存多個x,y資料(多個hashmap)，即為一條線的資料。(LinkedList<HashMap<String,Integer>)
	//再用一個linkedlist儲存每一條線的資料(LinkedList<LinkedList<HashMap<String,Integer>>>)
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines,recycle;
	
	public MySignPanel()
	{
		setBackground(Color.WHITE);
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				recycle.clear();
				LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
				HashMap<String,Integer> point = new HashMap<>();
				//將取得之X及Y座標儲存到hashMap中，並設定對應的key("X"及"Y")
				point.put("X", e.getX());
				point.put("Y", e.getY());
				//將取得的hashMap存到linkedlist中
				line.add(point);
				//將所產生的linkedlist(line)存到最大的linkedlist中(lines)
				lines.add(line);				
			}
		});
		
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(e);
				HashMap<String,Integer> point = new HashMap<>();
				point.put("X", e.getX());
				point.put("Y", e.getY());
				//將新產生的點存到lines所存入最新的資料(即為每次mousepress時所存入的line)中。
				lines.getLast().add(point);
				//每次取得執行paintComponent功能
				repaint();
			}
			
		});
		
		lines = new LinkedList<>();
		recycle = new LinkedList<>();
	}
	
	//1. mouse event, 2. data structure, 3. draw
	
	@Override
	//利用paintComponent產生畫筆功能
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		//設定畫筆顏色
		g2d.setColor(Color.blue);
		//設定畫筆粗細
		g2d.setStroke(new BasicStroke(4));
		
		//造訪lines中的每一個line
		for(LinkedList<HashMap<String,Integer>> line : lines)
		{
		//由於需要第二個點出現時才能畫第一條線，所以要從1開始尋訪
			for(int i = 1; i < line.size(); i++)
			{
				//由linkedlist中取得hashmap資料
				HashMap<String, Integer> p0 = line.get(i-1);
				HashMap<String, Integer> p1 = line.get(i);
				//將x0,y0,x1,y1值改為hashmap中的資料
				int x0 = p0.get("X"), y0 = p1.get("Y");
				int x1 = p1.get("X"), y1 = p1.get("Y");
				//依照x及y座標畫出線條
				g2d.drawLine(x0, y0, x1, y1);
			}
		}
	}
	
	public void clear()
	{
		lines.clear();
		repaint();
	}
	
	public void undo()
	{
			//因為.removeLast會將最新加入資料從結構中去除，並會回傳所去除的物件，可以將此物件存入另一個linkedlist
			recycle.add(lines.removeLast());
			repaint();
	}
	
	public void redo()
	{
		if(recycle.size() > 0)
		{
			lines.add(recycle.removeLast());
			repaint();
		}
	}
}
