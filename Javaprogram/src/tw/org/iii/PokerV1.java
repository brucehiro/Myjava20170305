package tw.org.iii;

public class PokerV1 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		int temp;
		boolean isrepeat;
		
		
		for(int j = 0; j < poker.length; j++)
		{
			//如果被判斷的值需要被執行一次才能判斷，即可用do.....while
			do
			{
				temp = (int)(Math.random()*52+1);
				isrepeat = false;
			
				if(temp == poker[j])
				{
					isrepeat = true;
					break;
				}
			}
			while(isrepeat);//while(boolean)，當boolean=true，會繼續執行while loop
			
			poker[j] = temp;
			System.out.println(poker[j]);
				
		}	
	}
}
