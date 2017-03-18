package tw.org.iii;

public class java20170312_7 {

	public static void main(String[] args) {//此程式會被執行，所以要有此行
		System.out.println(Bike.counter);//因為counter是類別的變數(宣告為static)，所以不用物件存在即可執行。當沒有物件被產生時，b = 0。
		//System.out.println(Bike.a);此會出現錯誤訊息，因為a並非static，所以要有物件才能呼叫。
		Bike b1 = new/*new為建立一個新物件，而呼叫Bike()則會使用Bike類別裡Bike()的方法*/ Bike();//宣告bi為Bike類別的物件，new成功的話，其物件屬性皆會有值。Bike()為建構式，只會使用一次。
		Bike b2 = new Bike(1);//輸入值如果為整數，但在類別方法中沒有定義Bike(int input)時，java會尋找是否有可以轉型後，可以執行的方法。例如此時有Bike(double input)，則java會把參考值轉為double。
		System.out.println(b1.a);
		System.out.println(b2.a);
		System.out.println("");
		System.out.println(Bike.counter);
		System.out.println("");
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		
		while(b1.getSpeed() <= 10)
		{
			b1.upSpeed();//呼叫Bike類別的.upSpeed方法
		}
			
		System.out.println(b1.getSpeed());
		
		while(b1.getSpeed() > 0)
		{
			b1.downSpeed();//呼叫Bike類別的.upSpeed方法
		}
		
		System.out.println(b1.getSpeed());
		

	}

}
