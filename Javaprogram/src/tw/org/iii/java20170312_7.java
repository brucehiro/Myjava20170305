package tw.org.iii;

public class java20170312_7 {

	public static void main(String[] args) {//此程式會被執行，所以要有此行
		Bike b1 = new Bike();//宣告bi為Bike類別的物件，new成功的話，其物件屬性皆會有值
		Bike b2 = new Bike();
		
		System.out.println(b1.getSpeed());
		
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
