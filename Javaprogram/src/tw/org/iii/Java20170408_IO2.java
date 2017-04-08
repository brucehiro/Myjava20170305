package tw.org.iii;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Java20170408_IO2 {

	public static void main(String[] args) {
		int a = 1; int b = 2; String c = "Hello", d = "測試";
		try
		{
			FileOutputStream outputfile = new FileOutputStream("./hiro1/data1.txt");
			
			//DataOutputStream可以當變數輸出，其需要一個輸出串流，所以要先建立一個outputStream作為參數。
			DataOutputStream dataout = new DataOutputStream(outputfile);
			dataout.writeInt(a);
			dataout.writeInt(b);
			dataout.writeUTF(c);
			dataout.writeUTF(d);
			outputfile.flush();
			outputfile.close();
		}
		catch(Exception ee)
		{
			System.out.println(ee.toString());
		}
	}

}
