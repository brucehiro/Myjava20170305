package tw.org.iii;

public class Java20170318_2 {

	public static void main(String[] args) {
		String id = "A123456789";
		System.out.println(id.matches("^[A-Za-z][12][0-9]{8}$"));
		/*
		 * ^ 開頭
		 * $ 結尾
		 * [a-z] a-z的集合取一
		 * [^a-z] a-z的反集合取一
		 * [0-9]{8} 0-9的集合取一，重複8次
		 */

	}

}
