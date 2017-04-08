package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Java20170408_IOimage_2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File readFile = new File("./hiro1/ub_100x.tif");
		File saveFile = new File("./hiro2/ub_100x.tif");
		
		try
		{
			//直接讀取整個檔案，再整個輸出
			//利用較大的記憶體空間，一次讀取整個檔案，減少每次只讀取一個byte所需的時間。速度會快於一次讀一個byte再輸出一個byte
			
			FileInputStream fileinput = new FileInputStream(readFile);
			//建立一個與檔案大小長度相同的byte[]
			byte[] b = new byte[(int)readFile.length()];
			//直接讀取(.read)與b長度相同的byte量
			fileinput.read(b);			
			fileinput.close();
			
			FileOutputStream fileout = new FileOutputStream(saveFile);
			//直接輸出(.write)與b長度相同的byte量
			fileout.write(b);
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
