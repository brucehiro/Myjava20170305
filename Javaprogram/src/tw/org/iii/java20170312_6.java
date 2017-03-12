package tw.org.iii;

public class java20170312_6 {

	public static void main(String[] args) {
		String a = new String("abc");//當string a被new出來時，a儲存指向有包含"abc"及物件實體(包含物件屬性)的記憶體位置(指標)。new會在一個新的記憶體位置儲存。
		String b = new String("abc");
		String c = "abc";//當string c被賦予"abc"時，java會先在記憶體空間中建立一個有"abc"及物件實體(包含物件屬性)的區域，而c會指向"abc"所在的區域。
		String d = "abc";//而d也被賦予"abc"，因此d也會指向與c相同的記憶體位置
		
		System.out.println(a==b);//當兩個物件使用"=="時，即在比較兩者是否為相同物件，由於string a即string b是指向不同記憶體區域的物件，所以輸出為false。
		System.out.println(c==d);//c及d指向相同的位置，所以為true
		System.out.println(a.equals(b));//以.equals可以比較string a及b的內容是否相同，而不是比是否為相同物件

		System.out.printf("a:%p\nb:%p",a,b);
		
	}

}
