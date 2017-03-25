package tw.org.iii;

//exception

public class java20170325_2_exception {

	public static void main(String[] args) {
		int a = 10; int b = 3;
		int[] c = {1,2,3,4};
		/*(1)try:先測試結果；catch:如果出現例外，()內為例外類型，catch後方的{}內為當符合指定的例外類型，執行{}的程式
		     如果不用例外，當a/b出現錯誤時，程式會終止在錯誤位置，而不會繼續執行後方程式
		  (2)try catch可以是巢狀的。
		  (3)例外皆是在處理執行階段的錯誤。
		  (4)例外間如果是直系的類別，則父類別要在後方；而非直系則沒有順序關係。
		  (5)當第一個try測試到可能出現例外，並catch到該例外輸出後，就會跳出try catch
		  (6)try也可以是巢狀的。
		*/
		try{
			System.out.println(a / b);
			try{
				System.out.println(c[4]);
				}
				catch(ArrayIndexOutOfBoundsException cc)
				{
					System.out.println("Out of range");
				}
		}catch(ArithmeticException ae){
			System.out.println("Error");
		}catch(RuntimeException re){
			System.out.println("xx");
		}
		
		System.out.println("Hello world");

	}

}
