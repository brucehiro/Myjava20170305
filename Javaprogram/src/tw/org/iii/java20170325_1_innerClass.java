package tw.org.iii;

public class java20170325_1_innerClass {

	public static void main(String[] args) {
		h3251 obj1 = new h3251();
		
		//由於h32511是h3251的內部類別，所以必須在h3251類別的物件先被建立出來後，才能建立出屬於h32511類別的物件。因此new是要由obj1內new出來(obj1.new)
		h3251.h32511 obj2 = obj1.new h32511();
		obj2.m1();
		h3251.m3();
		
		//雖然h32512是h3251的內部類別，但是h32512是static，所以不用h3251類別的物件先被建立出來後，才能建立。可以直接用類別建立該物件(h3251.h32512())<h3251類別下的h32512類別>
		h3251.h32512 obj3 = new h3251.h32512();
		
		
		

	}

}

class h3251
{
	h3251() {
		System.out.println("H3251()");
	}
	void m1()
	{
		System.out.println("H3251:m1()");
	}
	void m2()
	{
		System.out.println("H3251:m2()");
	}
	static void m3()
	{
		System.out.println("H3251:m3()");
	}
	class h32511
	{
		h32511() {
			System.out.println("H32511()");
		}
		void m1()
		{
			System.out.println("H32511:m1()");
			
			//可以利用下方的程式，呼叫h3251類別下的m1()
			h3251.this.m1();
			
			//m1()會呼叫自己，所以會進入無限遞迴
			//m1();
		}
	}
	static class h32512
	{
		h32512() {
			System.out.println("H32512()");
		}
		void m1()
		{
			System.out.println("H32512:m1()");
		}
	}
}