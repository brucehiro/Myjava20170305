package tw.org.iii;

public class Bike {
	private double speed; //宣告類別Bike的屬性，為Bike私有(private)的變數，只能透過方法才能取得speed的值
	
	void upSpeed()//建立Bike的方法
	{
		speed = (speed < 1)?1:(speed*1.2);
	}
	
	void downSpeed()
	{
		speed = (speed < 0.1)?0:(speed*0.7);
	}
	
	double getSpeed()
	{
		return speed;//利用getSpeed取得speed的值
	}
}
