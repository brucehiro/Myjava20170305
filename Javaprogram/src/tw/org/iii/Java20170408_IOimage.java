package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Java20170408_IOimage {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File readFile = new File("./hiro1/ub_100x.tif");
		File saveFile = new File("./hiro2/ub_100x.tif");
		
		try
		{
			FileOutputStream fileout = new FileOutputStream(saveFile);
			FileInputStream fileinput = new FileInputStream(readFile);
			int b;
			
			//每次讀入一個byte，再輸出一個byte至新資料夾中
			while((b = fileinput.read()) != -1)
			{
				fileout.write(b);
			}
			
			fileinput.close();
			fileout.flush();
			fileout.close();
			System.out.println("Finish");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
		
	}

}
