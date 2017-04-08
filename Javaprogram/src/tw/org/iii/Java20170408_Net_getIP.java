package tw.org.iii;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Java20170408_Net_getIP {

	public static void main(String[] args) {
		try
		{
			//InetAddress為與network相關的類別，該類別沒有建構式，所以不是用new，而是直接用該類別的方法來建立物件。
			//.getByName("主機名稱")可以取得該主機名稱的ip。在用.getHostAddress印出ip位址
			InetAddress ip1 = InetAddress.getByName("www.iii.org.tw");
			System.out.println(ip1.getHostAddress());
			
			//相同主機名稱可能因為DNS分流而出現多個ip，所以用.getAllByName可以取得所有為該主機名稱的ip。回傳為InetAddress[]
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.net");
			for(InetAddress ip : ips)
				System.out.println(ip.getHostAddress());
		}
		catch (UnknownHostException ee)
		{
			System.out.println(ee.toString());
		}

	}

}
