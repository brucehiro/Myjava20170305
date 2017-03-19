package tw.org.iii;

//多型、抽象類別

public class Java20170319_3 {

	public static void main(String[] args) {
		
		//因為a為抽象類別，所以無法產生物件，產生物件實體需要完整的內容，但抽象類別即包含不完整的屬性或方法
		//所以下列程式會出現錯誤
		//a b1 = new a();

		//因此可以使用子類別(非抽象)的建構式來初始化物件，即可以產生屬於抽象類別的物件。
		a b1 = new a1();
		a b2 = new a2();
		
		//實作m2()時，會因使用不同類別來初始化而產生不同的結果(多型)
		b1.m2();
		b2.m2();
	}

}

//有abstract方法的類別需要使用抽象類別(abstract class)
abstract class a
{
	a()
	{
		System.out.println("Hello");
	}
	void m1()
	{
		System.out.println("a:m1()");
	}
	
	//留給未來繼承的子類別使用，但由於沒有完整定義，所以要用抽象方法(abstract)。
	//強迫子類別產生多型。
	abstract void m2();
}

//當繼成抽象類別，需要完成m2()才能繼承。
class a1 extends a
{
	void m2()
	{
		System.out.println("a1:m2()");
	}
}

class a2 extends a
{
	void m2()
	{
		System.out.println("a2:m2()");
	}
}

//或是使用抽象類別來繼成抽象類別
abstract class a3 extends a
{
	abstract void m2();
	abstract void m3();
}

//即使沒有抽象方法，也可以建立抽象類別，使用此抽象類別也無法直接建立物件實體，需要使用子類別來建立。
abstract class a4
{
	void m1()
	{
		
	}
}


