package tw.org.iii;

public class Java20170319_4 {

	public static void main(String[] args) {
		b1 b1 = new b1();
		b1.m1();
		

	}

}

class b
{
	void m1(){}
	private void m2(){}
	b2 m3(){return new b2();}
	b3 m4(){return new b3();}
}
class b1 extends b
{
	//當要overwrite，並使用基本型別作為回傳值時，必須與父類別一樣。在此例中，不能用其他基本型別回傳。
	//存取修飾字要大於或等於父類別(public > protected > 無修飾字 > private)
	void m1(){}
	
	//父類別使用private，即代表沒有將m2()繼承給子類別，所以下方的m2()即為一個新的方法，不屬於overwrite。
	int m2(){return 1;}
	
	//當要overwrite，並以物件型別作為回傳值時，要新於或等於父類別的回傳值。如父類別回傳值回另一個父類別，則子類別要overwrite時，需要回傳另一個父類別或其子類別的型別才能。
	//下方合理。
	b3 m3(){return new b3();}
	
	//下方程式要overwrite時，由於父類別m2()方法
	//b2 m4(){return new b2();}
}

class b2 
{
	
}

class b3 extends b2
{
	
}
