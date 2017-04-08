package tw.org.iii;

public class Java20170408_uncertainReference {

	public static void main(String[] args) {
		m1("Hiro","Peter","Mary");
		m2(new String[]{"Hiro","Peter","Mary"});

	}
	
	static void m1(String name)
	{
		System.out.println("Hello " + name);
	}
	static void m1(String name1, String name2)
	{
		System.out.println("Hello " + name1);
		System.out.println("Hello " + name2);
	}
	static void m1(String ... names)
	{
		//names => String []
		//雖然String...即為String[]，但在呼叫方法時，使用String[]需要以String[]作為參數，而String... 可以是多個String，也可以沒有
		for(String name : names)
		{
			System.out.println("Hello " + name);
		}
	}
	static void m2(String[] names)
	{
		for(String name : names)
		{
			System.out.println("Hello " + name);
		}
	}
	
	//至少傳入一個參數的做法，要求一定要傳入一個string，後方則可以傳入不定個數的string。不定個數參數只能有一個，確定個數的只能在不定個數前方。
	static void m3(String name1, String ... names)
	{
		for(String name : names)
		{
			System.out.println("Hello " + name);
		}
	}

}
