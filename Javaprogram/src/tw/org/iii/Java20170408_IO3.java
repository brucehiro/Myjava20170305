package tw.org.iii;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Java20170408_IO3 {

	public static void main(String[] args) {
		try
		{
			DataInputStream datainput = new DataInputStream(new FileInputStream("./hiro1/data1.txt"));
			int a = datainput.readInt();
			int b = datainput.readInt();
			String c = datainput.readUTF();
			String d = datainput.readUTF();
			datainput.close();
			
			System.out.println("-> " + a + ":" + b + ":" + c + ":" + d);
		}
		catch (Exception ee)
		{
			System.out.println(ee.toString());
		}

	}

}
