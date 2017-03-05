package tw.org.iii;

public class boolean_practice {
	public static void main(String arg[]){
		int score = (int)(Math.random()*101);//產生0 - 100分的方式
		//由於math.random會產生 >= 0.0 ~ < 1.0的值，因此*101會產生0 ~ 100(強制轉成int)的值，101代表著數值的個數(0~100共101個)。想法與random() % 個數相同，
		
		System.out.println(score);
		
		if(score >= 60)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Down");
		}

	}
}
