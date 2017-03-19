package tw.org.iii;
//字串內容更改
public class Java20170319_7 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;
		System.out.println(s1 == s2);
		s1 = "Apple";
		System.out.println(s1 == s2);
		System.out.println("-------");
		
		String s3 = "Hello";
		//.concat方法只是將其括號中的字串一起與s3印出，但並沒有改變s3所指向的位置或內容
		System.out.println(s3.concat("aaa"));
		System.out.println(s3);
		
		//.replace的情況與.concat相似，將更改大小寫印出，但不會改變s3所指向的位置。
		System.out.println(s3.replace('e', 'E'));
		System.out.println(s3);
	}

}
