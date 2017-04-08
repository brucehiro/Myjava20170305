package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Java20170408_Sequencing2 {

	public static void main(String[] args) {
		try
		{
			//解序列化，與讀取檔案一樣，照順序傳遞，將物件讀入
			ObjectInputStream oint = new ObjectInputStream(new FileInputStream("./hiro1/student.object"));
			Object o1 = oint.readObject();
			Object o2 = oint.readObject();
			oint.close();
			
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			System.out.println(s1.getName() + ":" + s1.sumScore() + ":" + s1.avgScore());
			System.out.println(s2.getName() + ":" + s2.sumScore() + ":" + s2.avgScore());
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
