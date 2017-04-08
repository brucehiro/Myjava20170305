package tw.org.iii;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Java20170408_Sequencing {

	public static void main(String[] args) {
		Student s1 = new Student("Hiro", 30,40,55);
		Student s2 = new Student("Peter", 40,45,30);
		System.out.println("sum: " + s1.sumScore());
		System.out.println("avg: " + s1.avgScore());
		
		try
		{
			//序列化物件，將物件傳輸出去，代表可以將該物件的屬性傳輸出去。
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./hiro1/student.object"));
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

}


