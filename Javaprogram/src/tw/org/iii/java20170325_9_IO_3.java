package tw.org.iii;

import java.io.File;
import java.io.FileReader;

public class java20170325_9_IO_3 {

	public static void main(String[] args) {
		File file = new File("./hiro1/test1.txt");
		
		//利用FileReader讀文字檔案。FileReader讀取的方式為一次一個字元需要處理例外
		try
		{
			FileReader reader = new FileReader(file);
			int temp;
			
			while((temp = reader.read()) != -1)
			{
				System.out.print((char)temp);
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
