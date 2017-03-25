package tw.org.iii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class java20170325_9_IO_4 {

	public static void main(String[] args) {
		File file = new File("./hiro1/information.csv");
		try
		{
			//利用FileReader產生Reader物件，讀取文字檔
			FileReader fr = new FileReader(file);
			
			//利用BufferedReader接收Reader物件，並產生BufferedReader型別的物件
			BufferedReader br = new BufferedReader(fr);
			String input;
			//使用BufferedReader中的.readline()一行一行讀取內容
			while((input = br.readLine()) != null)
			{
				System.out.println(input);
			}
			fr.close();
		}
		catch (Exception ee)
		{
			System.out.println(ee.toString());
		}

	}

}
