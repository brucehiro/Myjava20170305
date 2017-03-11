package tw.org.iii;

public class java20170311_1 {
	
	public static void/*java的回傳值不是在此執行*/ main(String arg[]){
		int a = 10, b = 3;
		if(a-- >= 10 && b++ <= 3)//雖然a--及b++都會超過判斷值，但是在事後運算，所以結果為true
		{
			System.out.println("OK,a="+ a + "; b="+ b);//此時會印出運算完的結果(a=9;b=4)
		}
		else
		{
			System.out.println("xx,a="+ a + "; b="+ b);
		}
		
		int c = 10, d = 3;
		if(--c >= 10 && d++ <= 3)//--c會先執行，再判斷，所以會進到false，而且是用and，c已經判斷為false，所以d不會被用來判斷，也不會執行d++
		{
			System.out.println("OK,a="+ c + "; b="+ d);
		}
		else
		{
			System.out.println("xx,a="+ c + "; b="+ d);//此時會印出運算完的結果(c=9;d=3)
		}
		
		int v1 = 2, v2 = 3;
		int v3 = v1 & v2; //&(and)為二進位運算，並非判斷式。2的二進位為10，3的二進位為11，v1 & v2為10，結果為2。
		int v4 = v1 | v2; //|(or)為二進位運算，並非判斷式。2的二進位為10，3的二進位為11，v1 | v2為10，結果為3。
		System.out.println(v3);
		System.out.println(v4);
		
	}

	//傳回非
	
}

