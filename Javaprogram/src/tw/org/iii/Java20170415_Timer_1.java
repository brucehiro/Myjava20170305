package tw.org.iii;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Java20170415_Timer_1 extends JFrame{
	private Clock clock = new Clock();
	private Pool pool = new Pool();
	
	public Java20170415_Timer_1() {
		setLayout(new BorderLayout());
		
		add(clock,BorderLayout.NORTH);
		add(pool,BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Java20170415_Timer_1();
	}

}
