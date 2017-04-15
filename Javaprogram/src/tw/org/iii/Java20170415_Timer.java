package tw.org.iii;

import java.util.Timer;
import java.util.TimerTask;

public class Java20170415_Timer {
		
	public static void main(String[] args) {
		Timer timer = new Timer();
		//一個Timer物件可以加入多個TimerTask物件
		timer.schedule(new Mytask("a"), 3000, 1000);
		timer.schedule(new Mytask("b"), 1800, 500);
		timer.schedule(new StopJava(timer), 5000);
		
		System.out.println("main");
	}		
}
class Mytask extends TimerTask
{
	private String name;
	private int i;
	
	Mytask(String name){this.name = name;}
	@Override
	public void run() {
		System.out.println(name + ":" + i++);
	}
}
class StopJava extends TimerTask
{
	private Timer timer;
	StopJava(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		System.out.println("Terminated");
		timer.cancel();
	}
}
