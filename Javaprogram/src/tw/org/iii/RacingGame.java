package tw.org.iii;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RacingGame extends JFrame{
	private JButton go;
	//物件型別出值為null
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	private int Rank;
	private boolean running;

	public static void main(String[] args) {
		new RacingGame();

	}
	
	public RacingGame()
	{
		super("Racing Game");
		//GridLayout(raw,coloum)
		setLayout(new GridLayout(lanes.length+1, 1));
		
		go = new JButton("Go!");add(go);
		for (int i=0; i<lanes.length; i++)
		{
			JLabel lane = new JLabel((i+1) + ".");
			lanes[i] = lane;
			add(lane);
		}
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();	
			}
		});
		
				
		setSize(800,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go()
	{
		if(!running)
		{	
			running = true;	
			Rank = 1;
			for (int i=0; i<lanes.length; i++)
			{
				lanes[i].setText((i+1) + ". ");
			}
			for (int i=0; i<cars.length; i++)
			{
				cars[i] = new Car(i);
			}
			for (int i=0; i<cars.length; i++)
			{
				cars[i].start();
			}
		}
		
	}
	
	private void stopGame()
	{
		if(running)
		{
			running = false;
			//觸發InterruptedException
			for (int i=0; i<lanes.length; i++)
			{
				cars[i].interrupt();
			}
		}
	}
	
	private class Car extends Thread
	{
		private int carLane;
		
		Car(int carLane)
		{
			this.carLane = carLane;
		}
		
		@Override
		public void run() 
		{			
			for (int i=0; i<100; i++)
			{
				//setText設定lane的內容，getText取得目前lane的內容。
				lanes[carLane].setText(lanes[carLane].getText() + ">");
				try
				{
					Thread.sleep(10 + (int)(Math.random()*200));
				}
				catch(InterruptedException e)
				{
					//觸發例外時直接結束。
					return;
				}
			}
			
			lanes[carLane].setText(lanes[carLane].getText() + "WINNER");
			try
			{
				Thread.sleep(5);
				stopGame();
			}catch(InterruptedException e)
			{
				;
			}
		}
	}

}
