package tw.org.iii;

public class Java20170319_9 {

	public static void main(String[] args) {
		d1 s1 = new d2();
		s1.m1();
		//因為s1型別為d1，所以沒有m2()(m2()在d2中)。
		//s1.m2();
		
		d2 s2 = (d2)s1;
		s2.m1();
		s2.m2();
				
		//因為d1及d2是父子類別在編譯時可以轉；但是由於s3的內容是d3，d3與d2不是父子類別，而是兄弟類別，所以在執行時會產生例外(runtime exception)
//		d1 s3 = new d3();
//		d2 s4 = (d2)s3;
		
		//d3與d2不是父子類別，而是兄弟類別，因此轉型會造成編譯失敗
//		d2 s5 = new d2();
//		d3 s6 = (d3)s5;

	}

}

class d1
{
	void m1()
	{
		System.out.println("d1:m1");
	}
}

class d2 extends d1
{
	void m1()
	{
		System.out.println("d2:m1");
	}
	void m2()
	{
		System.out.println("d2:m2");
	}
}

class d3 extends d1
{
	void m1()
	{
		System.out.println("d3:m1");
	}
	void m2()
	{
		System.out.println("d3:m2");
	}
}
