package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Java20170408_Sequencing3 {

	public static void main(String[] args) {
		s040823 obj = new s040823();
		//序列化
		try
		{
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./hiro1/s040821"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK1");
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		//解序列化
		try
		{
			ObjectInputStream oint = new ObjectInputStream(new FileInputStream("./hiro1/s040821"));
			s040823 s1 = (s040823)oint.readObject();
			oint.close();
		}
		catch(Exception ee)
		{
			System.out.println(ee.toString());
		}

	}

}


//序列化可將物件傳遞出去，當物件有繼承關係時，有實作可序列化的類別在解序列化的時候，會被直接讀入；而沒有被實作序列化的類別，則會被重新實作一次物件
class s040821 implements Serializable
{
	s040821()
	{
		System.out.println("s040821");
	}
}

class s040822 extends s040821
{
	s040822()
	{
		System.out.println("s040822");
	}
}

class s040823 extends s040822 
{
	s040823()
	{
		System.out.println("s040823");
	}
}

