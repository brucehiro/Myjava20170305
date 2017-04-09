package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Java20170408_Net_sendfileTCP {

	public static void main(String[] args) {
		try
		{
			//建立檔案物件
			File sendFile = new File("./hiro1/crab.jpg");
			//建立接收檔案的byte[]
			byte [] buf = new byte[(int)sendFile.length()];
			//利用fileInputStream建立串流，並以bufferedInputStream接收檔案。(由file system input至java)
			BufferedInputStream br = new BufferedInputStream(new FileInputStream(sendFile));
			//將資料儲存於byte[]中
			br.read(buf);
			
			//建立socket，準備將資料傳輸至指定的ip及port
			Socket socket = new Socket(InetAddress.getByName("10.2.1.109"),9999);
			//建立socket外接串流(outputStream)(將資料由java傳出至指定ip中)
			OutputStream oout = socket.getOutputStream();	
			//藉由外接串流輸出byte[]
			oout.write(buf);
			//確實將buffer中的資料傳出至指定ip中
			oout.flush();
			
			//關閉外接管線及socket
			oout.close();
			socket.close();
			System.out.println("OK");
		
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
