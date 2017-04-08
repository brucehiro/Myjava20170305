package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Java20170408_Net_getFileTCP {

	public static void main(String[] args) {
		try
		{
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./hiro1/iii.jpg"));
			BufferedInputStream bint = new BufferedInputStream(socket.getInputStream());
			
			byte[] buf = new byte [4096]; int len;
			while((len = bint.read(buf)) != -1)
			{
				bout.write(buf,0,len);
			}
			
			bint.close();
			bout.flush();
			bout.close();			
			server.close();
			System.out.println("Receive OK!");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
