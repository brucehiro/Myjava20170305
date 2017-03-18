package tw.org.iii;

public class Bike {
	double speed; //宣告類別Bike的屬性，為Bike私有(private)的變數，只能透過方法才能取得speed的值(目前的方法為getSpeed)
	int a;//為Bike的屬性之一，為被建立之物件的屬性。
	static int counter;//宣告為static的變數，不屬於任何物件的變數，而是屬於類別的變數
	
	//建構式只是建立物件，沒有回傳值。在類別中建立Bike()主要是為了初始化物件的屬性。
	//以下都是Bike()建構式，但輸入值不同，或是輸入的參考值數量不同，此為超載(overload)
	Bike()//與類別的大小寫要一樣
	{
		this(0);//this意指本建構式，後方為輸入的參數。此例中輸入0會使用Bike(int input)。當建構式中，輸入值不同，但是內容相似時，可以使用this來簡化程式並增加維護性。
//		speed = 100;//當Bike()被呼叫時，其speed初始值被設定為100
		System.out.println("建立bike");//當執行建構式物件
	}
	
	Bike(int input)
	{
		this(input*1.0);//會進入Bike(double input)
	}
	
	//如果出現兩個建構式，會出現錯誤。但可以更改輸入之參考值，在呼叫Bike()時會利用不同的方法
	Bike(double input)
	{
		speed = input;
		System.out.println("有輸入參考值(double)");
		a++; 
		counter++;
	}
	
	
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
