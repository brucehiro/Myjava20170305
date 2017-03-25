package tw.org.iii;


//java.io.*只會載入java.io package內的類別
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class java20170325_8_IO_2 {

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
			
			
			//讀取資料。執行.read會讀取一個byte，並回傳int型態的值。
			//int data = inputFile.read();
		
			byte[] buf = new byte[(int)file.length()];
			int len = inputFile.read(buf);
			System.out.println(new String(buf,0,len));
			
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
