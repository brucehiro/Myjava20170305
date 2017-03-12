package tw.org.iii;

public class java20170311_4 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 100;
		int k;
		
		for(i = 1; i <= j; i++)
		{
			if (i == 1)
			{
				System.out.printf("%3d",i);
			}
			else if (i == 2)
			{
				System.out.printf("%3d*",i);
			}
			else
			{
				for(k = 2; k <= i; k++)
				{
					
					if(k == i)
					{
						System.out.printf("%3d*",i);
					}
					else if (i % k == 0)
					{
						System.out.printf("%3d ",i);
						break;
					}
					else
					{
						;
					}
				}	
			}
			
			if(i % 10 == 0)
			{
				System.out.printf("\n");
			}
		}

	}

}
