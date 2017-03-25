package tw.org.iii;

public class java20170325_3_exception {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		int a = -1;
		
		//由於不是屬於RuntimeException，所以必須要處理例外。
		try
		{
			b1.setLeg(a);
		}
		catch (MyException ee)
		{
			System.out.println(ee.toString());
		}
		catch (MyException2 ee)
		{
			System.out.println(ee.toString());
		}
		catch (Exception ee)
		{
			
		}
		
		
		System.out.println(b1.getLeg());

	}

}

class Bird
{
	private int leg;
	
	//當要拋出例外時，方法中必須標示throws + 例外名稱
	void setLeg(int n) throws Exception
	{
		//當條件符合時，拋出例外。但例外內容由使用者決定
		if(n > 2)
		{
			throw new MyException2();
		}
		else if(n < 0)
		{
			throw new MyException();
		}
		
		
		leg = n;
	}
	
	int getLeg()
	{
		return leg;
	}
}

class MyException extends Exception
{
	@Override
	public String toString() {
		return "欠腳";
	}
}

class MyException2 extends Exception
{
	@Override
	public String toString() {
		return "畸形鳥";
	}
}
