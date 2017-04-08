package tw.org.iii;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Java20170408_Net_packetSendTCP {

	public static void main(String[] args) {
		//TCP
		
			try
			{
				//利用socket與目標的特定port進行溝通
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);
				
				//以socket的getOutputStream方法建立輸出串流
				OutputStream out = socket.getOutputStream();
				
				//輸出byte[]
				out.write("Hello".getBytes());
				
				out.flush();
				socket.close();
			}
			catch (Exception e)
			{
				//System.out.println();
			}

	}

}
