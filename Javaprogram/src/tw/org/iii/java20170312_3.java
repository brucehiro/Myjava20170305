package tw.org.iii;

public class java20170312_3 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i<=10)
		{
			sum+=i;
			i++;
		}
		
		System.out.println(sum);
		System.out.println("");
		i = 1;
		sum = 0;
		
		for(;i<=10;)
		{
			sum+=i++;
		}
		
		System.out.println(sum);
		

	}

}
