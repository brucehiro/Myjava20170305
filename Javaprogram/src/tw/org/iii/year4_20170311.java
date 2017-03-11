package tw.org.iii;

import javax.swing.JOptionPane;

public class year4_20170311 {

	public static void main(String args[]) {
	String input = JOptionPane.showInputDialog("輸入年份");//JOptionPane.showInputDialog可以開啟式窗化的輸入介面，輸入值為string
		int year = Integer.parseInt(input);//Integer.parseInt可以將string轉為int
		if (year % 4 == 0)
		{
			if (year % 100 == 0)	
			{
				if (year % 400 == 0)
				{
					System.out.println("29");
				}
				else
				{
					System.out.println("28");
				}
			}
			else
			{
				System.out.println("29");
			}
		}
	
		else
		{
			System.out.println("28");
		}
	}
	
	
	
}
