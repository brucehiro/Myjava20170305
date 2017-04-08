package tw.org.iii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Java20170408_Net_getPacketTCP {

	public static void main(String[] args) {
		try
		{
			//TCP 發送方使用socket送出訊息，接收方用serversocket接收訊息，成功收到訊息後建立socket與發送方溝通
			
			//利用serverSocket接收對方的訊息
			ServerSocket server = new ServerSocket(9999);
			
			//接收到訊息並接受(.accept)後，會產生一個socket。此時開始已經變成socket對socket的溝通
			Socket socket = server.accept();
			
			//以.getInetAddress取得發送方ip，此時回傳為InetAddress。接著以.getHostAddress將取得之ip以string傳回
			System.out.println(socket.getInetAddress().getHostAddress());
			
			//建立bufferedReader接收訊息，其需以inputstreamReader物件作為參數，而inputstreamReader則需要一個inputStream作為參數。因此此處以socket建立之串流作為參數。
			BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String input;
			while((input = buf.readLine()) != null)
			{
				System.out.println(input);
			}
			
			buf.close();
			server.close();
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

	}

}
