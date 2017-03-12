package tw.org.iii;

public class java20170312_2 {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5};
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("");
		
		for(int v : a)//for each。for(被賦予的變數:陣列名稱)
		{
			System.out.println(v);//用此方法可以依序印出陣列中的元素
		}
		
		System.out.println("");
		
		int temp = a[2];
		a[2] = a[5];
		a[5] = temp;
		
		for(int v : a)//for(被賦予的變數:陣列名稱)
		{
			System.out.println(v);//用此方法可以依序印出陣列中的元素
		}
		
		System.out.println("");
		
		int[][] b = {{1,2,3,4},{5,6,7},{8,9},{10},{11,12,13}};
		
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[i].length; j++)
			{
				System.out.printf("%3d",b[i][j]);
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int[] c : b )//將二維陣列的元素賦予一維陣列
		{
			for(int v : c)//將一維陣列的元素賦予變數
			{
				System.out.printf("%3d",v);
			}
			
			System.out.println("");
			
		}
		

	}

}
