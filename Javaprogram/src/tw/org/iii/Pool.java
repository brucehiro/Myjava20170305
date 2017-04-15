package tw.org.iii;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class Pool extends JPanel{
	private Timer timer;
	private int viewH,viewW;
	private LinkedList<Ball> balls;
	
	Pool()
	{
		timer = new Timer();
		//每60毫秒更新一次
		timer.schedule(new ViewTask(), 0, 60);
		balls = new LinkedList<>();
		//schedule(TimeTask,開始時間，間隔時間)
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Ball ball = new Ball(e.getX(),e.getY());
				balls.add(ball);
				timer.schedule(ball, 0, 30 + (int)(Math.random()*70));
			}
		});
	}
	
	private class ViewTask extends TimerTask
	{
		@Override
		public void run() {
			repaint();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		viewW = getWidth(); viewH = getHeight();
		
		g2d.setColor(Color.green);
		g2d.fillRect(0, 0, viewW, viewH);
		g2d.setColor(Color.black);
		//藉由TimeMask中更改的x及y來畫球
		for(Ball ball : balls)
		{
			g2d.fillOval(ball.x, ball.y, 40, 40);
		}
		
		
	}
	
	private class Ball extends TimerTask
	{
		int x, y, dx, dy;
		Ball(int x, int y){this.x =x; this.y = y;dx = dy = 10;}
		@Override
		public void run() {
			if (x<0 || x+40 > viewW)
			{
				dx *= -1;
			}
			if (y<0 || y+40 > viewH)
			{
				dy *= -1;
			}
			x += dx;
			y += dy;
		}
	}
}
