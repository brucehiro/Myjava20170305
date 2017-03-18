package tw.org.iii;

public class Java20170318_1 {

	public static void main(String[] args) {
		TWId id1 = new TWId("A123456789");
		String id2 = new String("A123456789");
		System.out.println(id1.getId());
		System.out.println(TWId.IdCheck("A123456789"));
		if(id1.genderChoice())
		{
			System.out.println("女");
		}
		else
		{
			System.out.println("男");
		}
		
		TWId id3 = new TWId();
		TWId id4 = new TWId(false);
		TWId id5 = new TWId(1);
		TWId id6 = new TWId(true,12);
		
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		System.out.println(id5.getId());
		System.out.println(id6.getId());
	}

}
