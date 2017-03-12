package tw.org.iii;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PokerV2 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		boolean[] test = new boolean[52];
		int temp;
		//洗牌
		for(int i = 0; i < poker.length; i++)
		{
			do
			{
				temp = (int)(Math.random()*52);
			
			}while(test[temp]);
			
			poker[i] = temp;
			test[temp] = true;
		
			//System.out.println(poker[i]);
		}
		
		
		
		//發牌-->四個玩家-->每家13張
		
		int[][] player = new int [4][13];
		
		for(int i = 0; i < poker.length; i++)
		{
			player[i%4][i/4] = poker[i];
		}
		//攤牌
		String[] suits = {"黑桃","紅心","方塊","梅花"};
		String[] value = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","J ","Q ","K "};
		
		for (int[] pokerPlayer : player)
		{
			//理牌
			Arrays.sort(pokerPlayer);//使用快速排序
			
			for (int card : pokerPlayer)
			{
				System.out.printf("%s%s ",suits[card/13],value[card%13]);	
			}
			
			System.out.println("");
		}

	}

}
