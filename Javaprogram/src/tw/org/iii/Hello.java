package tw.org.iii; //package只能有一行，只能在第一行

public/*public為存取修飾字，可用於所有地方，public class只能有一個(類似main()),其他可以有多個.*/ class /*class只有public或沒有修飾字*/ Hello /*Hello為class名稱.*/ { //定義class
	public static/*主類別名稱一定要是public static*/ void/*不回傳值(void)*/ main(String array[]) /*參數包含字串陣列(String[] 陣列名稱)*/{ //定義method(main)
		System.out.println("Hello world");
		System.out.println("Hello Bruce");
	}
}
