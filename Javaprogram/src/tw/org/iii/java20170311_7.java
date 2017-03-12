package tw.org.iii;

public class java20170311_7 {

	public static void main(String[] args) {
		int[] d = new int[4];
		int[] e = new int[]{1,2,3,4};
		int[] f = {1,2,3,4};//宣告時就要給值
		int[] g;
		g = new int[]{1,2,3,4};
		
		int [][] a = new int[2][3];//官方建議
		int b[][];
		int [] c[];
		//System.out.println(a[0][3]);編譯時不會錯，但執行時會出現錯誤
		
		int [][] h;
		h = new int[2][];
		h[0] = new int[3];
		h[1] = new int[2];
		System.out.println(h.length);//對於陣列a而言，只有0及1兩個元素
		System.out.println(h[0].length);//對於a[0]而言，有0,1及2三個元素
		System.out.println(h[1].length);//對於a[1]而言，有0及1兩個元素
		
		//輸出不對稱的陣列
		for(int i = 0; i < h.length; i++)
		{
			for(int j = 0; j< h[i].length; j++)
			{
				System.out.printf("%d ",h[i][j]);
			}
			
			System.out.println("");
		}
		
	}

}
