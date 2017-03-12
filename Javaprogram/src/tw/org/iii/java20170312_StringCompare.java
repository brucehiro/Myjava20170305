package tw.org.iii;

import javax.swing.JOptionPane;

public class java20170312_StringCompare {

	public static void main(String[] args) {
		String genomeInput = new char[10]; genomeInput = JOptionPane.showInputDialog("輸入序列");
		String sequenceInput = JOptionPane.showInputDialog("輸入序列");
		
		compareSequence(genomeInput,sequenceInput);

	}
	
	static String compareSequence(String genome, String sequence)
	{
		for(int i = 0; i < sequence.length(); i++)//陣列中的長度為其屬性，所以用.length即可知道其長度；但string的長度需計算後才知道，所以需用.length()方法計算才可知。
		{
			if (sequence.charAt(i) == genome.charAt(i))//string g及a的第i個字元是否相同
			{
				A++;
			}
			else if (a.indexOf(g.charAt(i)) != -1)//觀察string g中第i個字元(g.charAt(i))是否存在string a中(a.indexOf)
			{
				B++;
			}
		return "";
	}

}
