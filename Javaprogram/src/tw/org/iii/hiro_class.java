package tw.org.iii;

public class hiro_class {
	int a;
	static int b;
	
	//程式區塊，會在建構式前執行。由於在呼叫建構式前就可以定義hiro_class類別的a屬性，即代表物件已經被建立了。因此建構式並非用在建立物件，而只是初始化物件屬性。
	{
		a = 100;
		System.out.println(a);
	}
	
	//static程式區塊，當類別被呼叫時，只會執行一次，與物件無關。
	static 
	{
		System.out.println("Static{}");
	}
	
	//初始化類別
	hiro_class()
	{
		System.out.println("Hello");
	}
	
//	void printInput()
//	{
//		this("","");
//	}
//	
//	void printInput(String a, String b)
//	{
//		System.out.println(a + b);
//	}
}
