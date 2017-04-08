package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Java20170408_Net_PacketSendUDP {

	public static void main(String[] args) {
		// UDP:無論對方是否收到，皆不斷傳出封包 。速度較快; TCP:以三方交握傳遞訊息。
		
			String data = "aaa";
			byte[] sendData = data.getBytes();
		try
		{
			//DatagramSocket建立傳送封包的物件
			DatagramSocket dsocket = new DatagramSocket();
			//DatagramPacket建立封包物件
			DatagramPacket dpacket = new DatagramPacket(sendData, sendData.length,InetAddress.getByName("127.0.0.1"),4444);
			dsocket.send(dpacket);
			dsocket.close();
			System.out.println("OK");
		}
		catch (Exception ee)
		{
			System.out.println(ee.toString());
		}
		
	}

}
