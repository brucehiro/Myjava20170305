package tw.org.iii;

public class java04 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		float var1 = 12;
		float var2 = 0.3f; //如果需要將屬於double的值宣告為float空間，需要加入f
		int c = 0;
		float d = 0;
		
		//System.out.println(a / c); //會出現除於0的例外
		System.out.println(var1 / d); //會出現infinity，因為當0被宣告為浮點數時，會變為非常接近0的值，所以會變為無限大。
		System.out.println(d / d); //會出現Not a number的結果(NaN)

		char var3 = 'a';
		char var5 = '資'; 
		char var4 = 100; // ASCII: d
		
		System.out.println(var3);
		System.out.println(var3 + var4);  //輸出為197(a = 97)。當變為數學運算時，就會變為int間的運算。
		System.out.println(var3 + var5);
		
		boolean var6 = true;//佔一個bit，編譯時會轉為1。java不能將boolean值宣告為1或0。
		boolean var7 = false;
	}

}
