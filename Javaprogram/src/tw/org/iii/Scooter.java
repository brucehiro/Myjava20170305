package tw.org.iii;

//extends為認後方類別為其父類別(Scooter的父類別為Bike)
//繼承會將物件屬性及方法繼承給子類別，但建構式不會繼承。
public class Scooter extends Bike{ 
	
	Scooter()
	{
		//super();因為建構是第一句不是this就是super，因此當某一類別被載入時，其父類別也會被載入記憶體，而該父類別之父類別也會被載入記憶體，直到Object(最上層的類別)類別被載入，此即為繼承。所以當繼承關係很大的時候，會很吃記憶體資源。
		System.out.println("Scooter()");
	}
	
	void upSpeed()//當使用的方法與父類別名稱相同時，會把父類別的方法蓋掉(overwrite)。可使用以下的繼承方法，並加以修改；或是取與父類別方法的名稱不同。
	{
		super.upSpeed();//先執行父類別的方法。
		speed = (speed < 1)?1.5:(speed*3.2);//再修改結果。
	}
}
