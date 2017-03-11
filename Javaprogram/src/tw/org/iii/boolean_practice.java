package tw.org.iii;

public class boolean_practice {
	public static void main(String arg[]){
		int score = (int)(Math.random()*101);//產生0 - 100分的方式
		//由於math.random會產生 >= 0.0 ~ < 1.0的值，因此*101會產生0 ~ 100(強制轉成int)的值，101代表著數值的個數(0~100共101個)。想法與random() % 個數相同，
		System.out.println(score);
		
		if(score >= 60)
		{
			if(score >= 70)
			{
				if(score >= 80)
				{
					if(score >= 90)
					{
						System.out.println("A");
					}
					else
					{
						System.out.println("B");
					}
				}
				else
				{
					System.out.println("C");
				}
			}
			else
			{
				System.out.println("D");
			}
		}
		else//具有else的if敘述句才是完整的敘述句
		{
			System.out.println("E");
		}

		{
			;//一個單元的結束需要包含 ;或}
		}
		
	
		
		
	}
}
