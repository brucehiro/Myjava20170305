package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

//視窗化

import javax.swing.JButton;//因為JButton不屬於java.lang，所以會import其所屬類別
import javax.swing.JFrame;//因為JFrame不屬於java.lang，所以會import其所屬類別
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Java20170318_4 extends JFrame{
	private JButton open, save, exit; //按鈕可能會在類別的其他地方被呼叫到，所以在此處宣告三種屬於JBtton型別的變數，生命週期會存在於整個class中。
	private MyPainter myPainter;
	
	//初始化
	Java20170318_4()
	{
		//super;
		super("視窗程式");//呼叫父類別的建構式，利用super(參數)。
		
		//setLayout可以自動排版，但他需要一個介面作為參數。當以介面(本例為layoutManager)作為參數時，須以一個實作該介面的類別作為參數值。
		//FlowLayout即為實作layoutManager的類別。
		//new FlowLayout():將有FlowLayout屬性的物件建立出來。如果需要更細部使用FlowLayout，可以將其移出，並給予名稱。
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//BorderLayout可以依照方向將視窗分隔，可以分成東南西北中
		setLayout(new BorderLayout());
		
		//建立三個屬於JButton型別的物件，並給予初始值
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		//JPanel型別具有容器的功能，可以包含物件在其中。下方例子加入了三個JButton物件。
		//而且top中的物件，因為使用FlowLayout()，沒輸入參數預設為中間，則這三個物件會固定在容器的中間。
		JPanel top = new JPanel(new FlowLayout());
		top.add(open); top.add(save); top.add(exit);
		
		myPainter = new MyPainter();
		
		//將容器top以BorderLayout放入視窗的北邊(上方)
		//因為myPainter繼承JPanel，屬於component(add只能加入component)，因此可以將其加入到視窗的中間。
		add(top,BorderLayout.NORTH);
		add(myPainter, BorderLayout.CENTER);
		
//		//加入三個JButton到視窗中
//		add(open);
//		add(save);
//		add(exit);
	
		//設定視窗大小。因為繼承JFrame，所以其方法或其父類別方法都可以使用。
		setSize(640,480);
		
		//設定視窗是否可視覺化。
		setVisible(true);
		
		//設定案下關閉鍵時，結束程式。因為定義父類別中，所以可以直接使用；否則就要輸入定義位置.選項。
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static/*要執行此程式時，會將其所屬的類別載入(本程式的類別為Java20170318_4)，所以用static*/ void main/*程式進入點*/(String[] args) {
		new Java20170318_4();//建立一個Java20170318_4()類別的物件。因為沒有建構式，所以會以JFrame無傳參數建構式為其唯一建構式。

	}

}
