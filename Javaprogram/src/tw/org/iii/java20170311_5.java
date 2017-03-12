package tw.org.iii;

public class java20170311_5 {

	public static void main(String[] args) {
		for(int i = 1, j = 10; i < 10; i++, j--)
		{
			System.out.println(i + ":" + j);
			
			if(i == 7)
			{
				break;
			}
		}
		
		System.out.println("---------");
		
		for(int k = 0; k<10; k++)
		{
			if(k % 2 == 0)
			{
				continue;
			}
			
			System.out.println(k);
		}
		
		System.out.println("---------");
		
		here://for的標記，只能直接連接for
		for(int i = 0; i < 10; i++)
		{
			for(int j = 9; j > 0; j--)
			{
				System.out.println(i + ":" + j);
				
				if (j % 5 == 0)
				{
					break here;//會脫離有here標記的for loop，否則只會脫離break所在的迴圈
					 
				}
				
				/*if (j % 7 == 0)
				{
					continue here; 跳離下方程式碼，直接由有here標記的for loop執行新的迴圈
				}*/
				
				//continue;
				//System.out.println();如果此句存在，會編譯失敗，因為此句無法到達(在continue後)
			}
		}

	}

}
