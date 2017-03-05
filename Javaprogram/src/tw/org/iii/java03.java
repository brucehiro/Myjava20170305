package tw.org.iii;

public class java03 {

	public static void main(String[] args) {
		//變數名稱第一個字元只能用[a-zA-Z$_]，第二個開始可以用[a-zA-Z0-9$_]，不可以使用關鍵字
		//關鍵字全為小寫
		//big5只使用2 byte => 2^16 => 65536; UTF-8 => 2^24
		byte a1 = 127; //當宣告為byte時，其大小即不會改變。
		byte a2, a3, a4;
		byte a6 = 127;
		a1 = (byte)(a1 + 1);//當數學運算左右值有一不是常數時，則會將運算結果轉為int，然而a1為byte，所以會出現錯誤。會有此狀況會出現在變數為byte、short及int中。
		//因此需要使用強制轉型財不會出現錯誤。
		a6++;//++或+=為二進位的位移，所以不會造成錯誤。當a6++時，不會變為128導致溢位，而是經二進位轉移變為-128(10000000)；+= 2時會變為-127。
		System.out.println(a6);
		System.out.println(a1);
		

	}

}
