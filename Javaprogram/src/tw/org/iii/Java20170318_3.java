package tw.org.iii;

public class Java20170318_3 {

	public static void main(String[] args) {
		Bike s1 = new Bike();//

		//任何一個類別，當沒有建構式時，會以父類別(Scooter的父類別為Bike)的無傳值建構式為唯一的建構式
		//即使有建構式，因為會執行super()，所以父類別的無傳值建構式還是會被執行
		Scooter s2 = new Scooter();
		
		System.out.println(s1.getSpeed());
		System.out.println(s2.getSpeed());
		
		s1.upSpeed();
		s1.upSpeed();
		s2.upSpeed();
		s2.upSpeed();
		
		System.out.println(s1.getSpeed());
		System.out.println(s2.getSpeed());

	}

}
