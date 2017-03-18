package tw.org.iii;

import javax.swing.JOptionPane;

public class java20170317_code {

	public static void main(String[] args) {
		String resultCheck;
		String code;
		
		do
		{
			code = JOptionPane.showInputDialog("請輸入密碼");		
			resultCheck = codeCheck(code);
			
		}while(resultCheck == "" || resultCheck != "ok");
		
		JOptionPane.showMessageDialog(null, "您輸入的密碼:" + code);		
	}
	
	static String codeCheck(String code)
	{
			
		if(code.length() < 6)
		{
			JOptionPane.showMessageDialog(null, "輸入密碼過短，請重新輸入!");
			return "error";
		}
		else if(code.length() > 20)
		{
			JOptionPane.showMessageDialog(null, "輸入密碼過長，請重新輸入!");
			return "error";
		}
		else
		{
			for (int i = 0; i < code.length(); i++)
			{
				int inputTransfer = code.charAt(i);
				
				if(inputTransfer >= 48 && inputTransfer <= 57)
				{
					;
				}
				else if(inputTransfer >= 65 && inputTransfer <= 90)
				{
					;
				}
				else if(inputTransfer >= 97 && inputTransfer <= 122)
				{
					;
				}
				else 
				{
					switch(inputTransfer)
					{
						case 36:
						case 37:
						case 42:
						case 63:
						case 94:
						case 95:
							;
							break;
							
						default:
							JOptionPane.showMessageDialog(null, "輸入密碼不符規定，請重新輸入!");
							return "error";
					}
				}
			}
		}
		
		return "ok";
	}

}
