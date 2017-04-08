package tw.org.iii;

import java.io.File;
import java.io.FileOutputStream;

public class Java20170408_IO {

	public static void main(String[] args) {
		String inputString = "test";
		
		//雖然所指定的檔案位置不存在，但是new可以建立完整物件，位置是作為參數，位置不存在，所new出的File會指向null
		File outputFile = new File("./hiro1/20170408output.txt");
		try
		{
			//建立輸出串流
			//雖然所指向的位置之檔案不存在，但output時會自動在指定位置作出該檔案，會覆寫同名的檔案(即為linux的標準輸出[> filename])
			//FileOutputStream(File,true)可以加入資料而不是覆寫
			FileOutputStream fileout = new FileOutputStream(outputFile);
			
			//利用FileOutputStream.write將指定字串輸出至檔案中
			fileout.write(inputString.getBytes());
			
			//將輸出至OS buffer的資料輸出至檔案中。要在關閉串流前使用.flush()才能確保資料都順利輸出至檔案中
			//FileInputStream則不用.flush()，因為資料都完全輸入至java檔案後，java才會關閉串流，所以與output不同。對於java而言，當資料都傳出java時，就等於是輸出完成，但資料還可能在buffer中。
			fileout.flush();
			
			//關閉輸出串流
			fileout.close();
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
