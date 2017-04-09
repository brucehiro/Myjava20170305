package tw.org.iii;

import java.util.HashSet;
import java.util.TreeSet;

public class Java20170409_Collection_TreeSet {

	public static void main(String[] args) {
		//<>中為指定型別(泛型)，只能輸入指定的型別，否則在編譯時期會報錯。自然排序treeset在撰寫時就會直接開始排序，所以如果加入非指定的型別就會出現錯誤。
		TreeSet<Integer> set = new TreeSet<>();
		set.add(12);
		set.add(56);
		//由於加入的為string，所以會報錯
//		set.add("78");
		byte i = 12;
		//byte可自動轉型為int，但是由於在.add()中會被轉為物件，即auto-boxing。所以直接丟入byte會被轉為Byte類別，所以會出現錯誤；但可以先加入(int)強制轉型為int後，再auto-boxing，就可以執行。
		set.add((int)i);
		System.out.println(set);
		
		
		//字串的自然排序會比對單一字元，與數值不同。字元的自然比對會以ascii code來排序
		TreeSet<String> set1 = new TreeSet<>();
		set1.add("1");
		set1.add("2");
		set1.add("12");
		System.out.println(set1);
		//由於已經指定型別為string，所以可以用string接收
		for(String obj : set1)
		{
			System.out.println(obj);
		}
		
		
		//addAll
		HashSet set2 = new HashSet();
		set2.add(1);
		HashSet set3 = new HashSet();
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set2.addAll(set3);
		System.out.println(set2.size());
		

	}

}
