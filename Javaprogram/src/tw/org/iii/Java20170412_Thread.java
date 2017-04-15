package tw.org.iii;

public class Java20170412_Thread {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("mt1");
		MyThread mt2 = new MyThread("mt2");
		//用start()才可以表現出多重執行緒，否則只是一般呼叫物件方法。下利用run()，只是直接使用該方法。
//		mt1.run();
		//進入等待區，等待JVM選擇執行其中一個執行序
		mt1.start();
		mt2.start();
		//主執行緒會持續進行，可能會出現在第一個或中間，因為上方兩個執行緒會先進入等候區，由JVM選擇執行；然而main-thread(main())會持續進行，所以可能會先被執行，或是某一個執行緒開始執行後執行。
		System.out.println("Ya");
		try
		{
			//thread的sleep()是static，所以不用建立物件即可使用
			Thread.sleep(400);			
			System.out.println("Hello world");
		}
		catch(InterruptedException e)
		{
			;
		}
		//雖然mt1的會表現生命特徵之週期在上方已經結束，但物件本身依然存在，因此可以呼叫其方法。
		mt1.run();
		//但不能再讓其表現第二次生命特徵。執行方法程式會出現IllegalThreadStateException例外
		//mt1.start();

	}
}

class MyThread extends Thread
{
	private String mt;
	
	MyThread(String mt){this.mt=mt;}
	//run()為此類別的生命週期。原本Thread的run()為只有存活一次。override此方法可以表現生命特徵(run()裡的程式)
	@Override
	public void run() { //生命開始
		for(int i=0; i<10; i++)
		{
			System.out.println(mt + ":" + i);
			try
			{
				//每次執行緒執行會睡0.1秒，所以多個執行緒會接續切換被執行(mt1:1 -> mt2:1 -> mt1:2 -> mt2:2....)
				Thread.sleep(100); //以mS為單位
			}catch(InterruptedException e)
			{
				//目前的程式只有關機會造成此例外
			}
		}
	} //生命結束

}
