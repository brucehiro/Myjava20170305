package tw.org.iii;

public class java20170325_5_exception {

	public static void main(String[] args) {
		new h325_51().m1();

	}

}

class h325_51
{
	void m1()
	{
		//如果只有throw new Exception()時，m1()須加入m1() throws Exception。但當內部使用try catch處理例外，即可以不用使用throws交給使用者處理例外
		try
		{
			System.out.println("do something");
			throw new Exception();
			
			//如果在try catch finally結構中，出現return;(如下方程式碼)，因為已經return，所以此結構下方的程式就不會再執行了。但是因為finally處在同一個結構，所以finally中的程式還是會執行。
			//retrun;
		}
		catch (Exception ee)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("ok");
		}
		System.out.println("end");
	}
}