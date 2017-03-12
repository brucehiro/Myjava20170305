package tw.org.iii;

import javax.swing.JOptionPane;

public class java20170312_5 {

	public static void main(String[] args) {
		//1. create answer
		String answer = createAnswer(3);//createAnswer為自己寫方法，用ctrl+左鍵可以開起該方法(副程式)
		System.out.println(answer);
		
		//2. start
		boolean isWin = false;
		String hist = "";
		for(int i = 0; i < 10; i++)
		{
			//2-1. input a number string
			String guess = JOptionPane.showInputDialog((i+1) + "." + "輸入數字:\n" + hist);//將由視窗化輸入知結果，賦予字串guess
			
			//2-2. compare string => result
			String result = checkab(answer, guess);
			hist += (i+1) + "." + guess + " " + result + "\n";
			JOptionPane.showMessageDialog(null, result);//以視窗化輸出結果，null為該視窗化程式之父程式為何，目前為獨立，所以選null
			
			//2-3. right --> break
			if(result.equals("3A0B"))
			{
				isWin = true;
				break;
			}
			//2-4. wrong --> repeat > 10 times
		}
		
		//3. show winner/loser
		if(isWin)
		{
			JOptionPane.showMessageDialog(null, "成功");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "失敗!答案是:" + answer);
		}
		

	}
	//create answer，建立createAnswer的static方法(即副程式)
	static String createAnswer(int e)
	{
		boolean[] check = new boolean[10];//樣本包含0 - 9
		int[] number = new int[e];//只需3個值
		int temp;
		
		for(int i = 0; i < number.length; i++)
		{
			do
			{
				temp = (int)(Math.random()*10);//隨機產生樣本0 - 9
			
			}while(check[temp]);
			
			number[i] = temp;
			check[temp] = true;
		}
		String ret = "";
		for(int i = 0; i < number.length; i++)
		{
			ret+=number[i];//將number陣列元素傳入ret字串
		}
		return ret;
	
	}
	//check answer and guess
	static String checkab(String a, String g)
	{
		int A,B; A = B = 0;
		
		for(int i = 0; i < g.length(); i++)//陣列中的長度為其屬性，所以用.length即可知道其長度；但string的長度需計算後才知道，所以需用.length()方法計算才可知。
		{
			if (g.charAt(i) == a.charAt(i))//string g及a的第i個字元是否相同
			{
				A++;
			}
			else if (a.indexOf(g.charAt(i)) != -1)//觀察string g中第i個字元(g.charAt(i))是否存在string a中(a.indexOf)
			{
				B++;
			}
	
		}
		return A + "A" + B + "B";
	}
}
