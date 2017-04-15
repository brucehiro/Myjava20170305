package tw.org.iii;

public class Java20170415_Thread_1 {

	public static void main(String[] args) {
		t04151 t1 = new t04151();
		//setDaemon是背景執行緒，未設定為false，當是false時，當主序結束，此執行緒會執行到結束為止。
		//setDaemon設為true時，當主序結束時，會設為背景執行緒，與主序一起結束。
		t1.setDaemon(true);
		t1.start();
		try
		{
			Thread.sleep(1);
		}catch(InterruptedException e)
		{
			;
		}
		System.out.println("OK");

	}

}
class t04151 extends Thread
{
	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println(i);
		}
		try
		{
			//sleep的時間精準度不高
			Thread.sleep(500);
		}catch(InterruptedException e)
		{
			;
		}
	}
}
