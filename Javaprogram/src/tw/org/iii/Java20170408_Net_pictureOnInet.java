package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Java20170408_Net_pictureOnInet {

	public static void main(String[] args) {
		try
		{
			URL url = new URL(
					"https://i.ytimg.com/vi/T-utO9wqtcU/maxresdefault.jpg");
			URLConnection ucont = url.openConnection();
			ucont.connect();
			InputStream in =ucont.getInputStream();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./hiro1/iii.jpg"));
			BufferedInputStream bint = new BufferedInputStream(in);
			
			byte[] buf = new byte[4096]; int len;
			while((len = bint.read(buf)) != -1)
			{
				bout.write(buf, 0, len);
			}
			
			bint.close();
			bout.flush();
			bout.close();
			
			System.out.println("OK");
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
