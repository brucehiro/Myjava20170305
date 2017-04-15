package tw.org.iii;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class Clock extends JLabel{
	private Timer timer;
	private int i;
	Clock()
	{
		timer = new Timer();
		timer.schedule(new ClockTask(), 0, 1000);
		
	}
	private class ClockTask extends TimerTask
	{
		@Override
		public void run() {
			//Calendar為抽象類別，且建構式為protect，所以必須要繼承他才能使用其方法。然而此類的類別大多會有static方法可以取得該類別物件實體
			//getInstance()會回傳一個Calendar類別的物件實體
			Calendar now = Calendar.getInstance();
			int hh = now.get(Calendar.HOUR_OF_DAY);
			int mm = now.get(Calendar.MINUTE);
			int ss = now.get(Calendar.SECOND);
			setText(hh + ":" + mm + ":" + ss);
		}
	}
}
