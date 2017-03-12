package tw.org.iii;

public class java20170311_3 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k = 0;
		int line = 0;
		int result = 0;
		
		for(k=0; k < 2; k++)
		{	
			for(i = 1; i < 10; i++)
			{
				for(j = 2;j <= 5; j++)
				{
					line = j+4*k;
					result = line*i;
					System.out.print(line + "*" + i + "=" + result + "\t");
				}
			
				System.out.println("");
			}
		
			System.out.println("");
			
		}
		/*
		 for(迴圈進入點(只會執行一次)(1);判斷式(布林值)(2);迴圈內敘述式執行完後值型的敘述句(4))
		 {
		 	程式主體(3);
		 }
		 
		 (1)-->(2)-->(3)-->(4)-->(2)-->....直到(2)為false為止
		 */

	}

}
