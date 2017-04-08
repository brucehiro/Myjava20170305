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
			File sendFile = new File("./hiro1/crab.jpg");
			byte [] buf = new byte[(int)sendFile.length()];
			BufferedInputStream br = new BufferedInputStream(new FileInputStream(sendFile));
			br.read(buf);
			
			Socket socket = new Socket(InetAddress.getByName("10.2.1.109"),9999);
			OutputStream oout = socket.getOutputStream();
			
			oout.write(buf);
			oout.flush();
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
