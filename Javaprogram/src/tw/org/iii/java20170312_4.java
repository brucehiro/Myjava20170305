package tw.org.iii;

public class java20170312_4 {

	public static void main(String[] args) {
		String a1 = new String();//字串陣列
		
		System.out.println(a1);
		
//		//以byte陣列建立字串
		byte[] b1 = {97,98,99,100};
		String c1 = new String(b1);
		
		System.out.println(c1);
//		
		String d1 = new String(b1, 2, 2);//String(byte字串，偏移量(offset)<由byte陣列的偏移>，長度<string長度>)
//		
		System.out.println(d1);
		
		
		String e = "abcdefg";//有雙引號標註的內容皆為物件實體
//		
		char c2 = c1.charAt(3);//.charAt(數值)，可以看到字串物件第四個字元的值
		System.out.println(c2);
		System.out.println("abcdefgh".charAt(3));//直接用""也可以當作物件
		
		System.out.println(e.indexOf('a'));//可以輸出string e中a的位置，此結果為0。如果沒有存在e中，則回傳-1
		
	}

}
