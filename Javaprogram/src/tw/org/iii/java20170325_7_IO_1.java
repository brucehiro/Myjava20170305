package tw.org.iii;


//java.io.*只會載入java.io package內的類別
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class java20170325_7_IO_1 {

	public static void main(String[] args) {
		//用/作為目錄符號，.的意義同./
		File file = new File("./hiro1/test1.txt");
		if (file.exists())
		{
			//.getAbsolutePath()取得絕對路徑
			System.out.println("present:" + file.getAbsolutePath());
		}
		else
		{
			System.out.println("absent");
		}
	
		//FileInputStream需要處理例外
		try
		{
			FileInputStream inputFile = new FileInputStream(file);
			//因為UTF-8是用3個byte，所以要讀取3個byte來組成一個字
			byte[] buf = new byte[3];
			int len;
			
			while ((len = inputFile.read(buf)) != -1)
			{
				//利用印出byte陣列，並指定開頭及長度。
				System.out.print(new String(buf,0,len));
			}
			
			//關閉資料讀取。.close方法需要處理IOException
			inputFile.close();
		}
		catch (FileNotFoundException ee)
		{
			System.out.println(ee.toString());
		}
		//IOException是FileNotFoundException父類別，所以要在
		catch (IOException ee)
		{
			System.out.println(ee.toString());
		}
	}

}
