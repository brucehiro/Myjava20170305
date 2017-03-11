package tw.org.iii;

public class java_20170311_02 {

	public static void main(String[] args) {
		int a=10;
		final int b = 12;//final可使變數b變為常數
		switch(a) //switch內只能用int內的型別(char, byte, short, int)，switch會依照輸入的型別規定case的範圍
		{
			case 1://case只能是常數
				System.out.println("A");
				break;
			case b://因為b變為常數，所以可以使用
				System.out.println("B");
				break;
			case b-2://常數與常數運算為常數，所以可以使用
				System.out.println("C");
				break;//可以不用break，但是當不用break時，進到某個case後，會將該case下方所有的結果皆輸出，直到break，或結束
			default:
				System.out.println("D");
		}

	}

}
