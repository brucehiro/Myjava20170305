package tw.org.iii;

import javax.swing.JFrame;//因為JFrame不屬於java.lang，所以會import其所屬類別

public class Java20170318_4 extends JFrame{
	Java20170318_4()
	{
		//super;
		super("視窗程式");//呼叫父類別的建構式，利用super(參數)。
		//System.out.println("Hello");
		setSize(640,480);//設定視窗大小。因為繼承JFrame，所以其方法或其父類別方法都可以使用。
		setVisible(true);//設定視窗是否可視覺化。
		setDefaultCloseOperation(EXIT_ON_CLOSE);//設定案下關閉鍵時，結束程式。因為定義父類別中，所以可以直接使用；否則就要輸入定義位置.選項。
	}

	public static/*要執行此程式時，會將其所屬的類別載入(本程式的類別為Java20170318_4)，所以用static*/ void main/*程式進入點*/(String[] args) {
		new Java20170318_4();//建立一個Java20170318_4()類別的物件。因為沒有建構式，所以會以JFrame無傳參數建構式為其唯一建構式。

	}

}
