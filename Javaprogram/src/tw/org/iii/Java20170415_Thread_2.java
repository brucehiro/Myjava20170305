package tw.org.iii;

public class Java20170415_Thread_2 {

	public static void main(String[] args) {
		//利用thread接收thread2物件，則thread即可執行t2的生命特徵
		Thread2 t2 = new Thread2("t2");
		Thread tt = new Thread(t2);
		
		Thread2 t3 = new Thread2("t3");
		Thread tt3 = new Thread(t3);
		
		tt.start();
		tt3.start();

	}

}

//繼承thread即可以成為執行緒
class Thread1 extends Thread
{
	@Override
	public void run() {
		for (int i=0; i<10; i++)
		{
			System.out.println(i);
		}
	}
}

//此時僅時作runnable，並非執行緒，可以將此作為另一個執行緒的參數。以此方法可以增加彈性，因為如果繼承thread後，就不能繼承其他父類別
class Thread2 implements Runnable {
	private String name;
	Thread2(String name)
	{
		this.name = name;
	}
	
	public void run() {
		for (int i=0; i<10; i++)
		{
			System.out.println(name + ":" + i);
			try
			{
				Thread.sleep(100);
			}catch(Exception e)
			{
				;
			}
		}
	}
}
