package tw.org.iii;

public class java20170311_6 {

	public static void main(String[] args) {
		boolean[] a;//官方建議此標示法
		int b[];//也可以執行
		
		a = new/*new為作出完整的物件實體*/ boolean[3];//有三個元素的整數物件如為。賦予char, byte, short及int初始值，則皆為0，float, double為0.0，boolean為false。
		
		System.out.println(a.length);//.length可輸出陣列大小
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	
		System.out.println("");
	
		int counter = 1000;
		int[] c = new int[7];//a[number]中的number為記憶體位置的偏移量，為陣列名稱所指向記憶體位置的偏移量。0即為第一個元素的位置，也為a所指向的記憶體位置。
	
		for(int j = 0; j < counter; j++)
		{
			int dice = (int)(Math.random()*9+1);
			
			if(dice > 6)
			{
				c[dice - 3]++;
			}
			else
			{
				c[dice]++;
			}
			
			//上方的if else也可以用三元運算式 ? : ;執行。(boolern)?ture值:false值。c[(dice>=6)?dice-3:dice]++;
		}
	
		for(int i = 1; i <= 6; i++)
		{
			System.out.println(i + ":" + c[i]);
		}
	}
}
