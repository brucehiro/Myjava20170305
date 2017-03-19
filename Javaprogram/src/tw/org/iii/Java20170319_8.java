package tw.org.iii;

//StringBuffer

public class Java20170319_8 {

	public static void main(String[] args) {
		//StringBuffer的容量(capacity)無傳參考建構式為16個字元
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		sb1.append("12345678901234567");
		//當超過原本的容量時，StringBuffer會自動加大。
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		//使用StringBuffer時，即使更改內容，也不會變更StringBuffer型別物件所指向的位置。
		//但下方程式如果使用String則在更改內容後，改變s1所指向的位置。
		StringBuffer sb2 = sb1;
		System.out.println(sb1 == sb2);
		sb1.append("123");
		System.out.println(sb1 == sb2);
		System.out.println(sb1);

	}

}
