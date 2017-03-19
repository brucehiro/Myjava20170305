package tw.org.iii;

//繼承

public class Java20170319_1 { //public class只能有一個，名稱與類別名稱大小寫需相同

	public static void main(String[] args) {
		
		//當此物件被建立時，因為建構式中有super，所以回先向父類別呼叫，所以執行會由最上層的父類別開始執行(J0319_2)
		//而當有static()在類別的程式區塊中，只要被載入到記憶體時，即會被執行。
		//Java為單一繼承。
		J0319_4.m1();
		J0319_4 b1 = new J0319_4();
		J0319_4 b2 = new J0319_4();
		

	}

}

class J0319_2
{
	static 
	{
		System.out.println("J1");
	}
	J0319_2()
	{
		//super()
		System.out.println("J0319_2()");
	}
	J0319_2(int a)
	{
		//super()
		System.out.println("J0319_2(int)");
	}
}

//當類別中沒有建構式，會以父類別的無傳參數建構式為唯一建構式。但由於父類別沒有無傳參數建構式，所以當J0319_3{}沒內文的時候，會出現錯誤訊息
class J0319_3 extends J0319_2 
{
	//如果此建構式{}沒有內容，會出現錯誤，因為建構是第一句不是this就是super，如果都不輸入就隱含super()。super()沒傳參數時，即去呼叫父類別的無傳參數建構式。

	static 
	{
		System.out.println("J2");
	}
	
	J0319_3(String a)
	{
		//super();
		
		//因此可以用super()，並傳一參數(如下方傳int 2)，就不會有錯誤訊息。
		//super(2);如果沒有此行時，則會隱含super()，所以會呼叫父類別的無傳參數建構式。
		System.out.println("J0319_3(string)");
	}
}

class J0319_4 extends J0319_3
{
	static 
	{
		System.out.println("J3");
	}
	
	J0319_4()
	{
		super("Hello");
		System.out.println("J0319_4()");
		
	}
	
	static void m1()
	{
		System.out.println("m1()");
	}
}