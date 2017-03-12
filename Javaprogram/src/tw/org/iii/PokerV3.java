package tw.org.iii;

import java.util.Arrays;

public class PokerV3 {
//poke switch
	public static void main(String[] args) {
		int[] poker = new int[52];
		int card;
		
		for(int i = 0; i < poker.length; i++)
		{
			poker[i] = i;
		}
		
		for(int i = 0; i < poker.length; i++)
		{
			int temp = 0;
			card = (int)(Math.random()*(52-i));
			temp = poker[(poker.length-1)-i];
			poker[(poker.length-1)-i] = poker[card];
			poker[card] = temp;
		}
		
//		for(int i = 0 ; i < poker.length; i++)
//		{
//			System.out.printf("%3d",poker[i]);
//		}
		//發牌
		int[][] player = new int [4][13];
		
		for(int i = 0; i < poker.length; i++)
		{
			player[i%4][i/4] = poker[i];//i%4等於玩家的順序，由0 - 3；而i/4則為玩家所拿到第幾張牌，因為i為int，會無條件捨去，所以可以得到0, 1, 2, 3,....
		}
		//攤牌
		String[] suits = {"黑桃","紅心","方塊","梅花"};
		String[] value = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","J ","Q ","K "};
		
		for (int[] pokerPlayer : player)
		{
			//理牌
			Arrays.sort(pokerPlayer);//使用快速排序
			
			for (int vi : pokerPlayer)
			{
				System.out.printf("%s%s ",suits[vi/13],value[vi%13]);	
			}
			
			System.out.println("");
		}

				
			
			
		}

	}


