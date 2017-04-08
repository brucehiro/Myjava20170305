package tw.org.iii;

public class OCJP048 {

	public static void main(String[] args) {
		int [] x = {1,2,3};
		int y[] = {4,5,6};
		new OCJP048().go(x, y);
		

	}
	
	//...為不訂個數的輸入，在此處為輸入不訂個數的一維int陣列作為參數
	void go(int[] ... z)
	{
		//z => int[][] => {{1,2,3},{4,5,6}}
		for(int[] a : z)
		{
			System.out.println(a[0]);
		}
	}

}
