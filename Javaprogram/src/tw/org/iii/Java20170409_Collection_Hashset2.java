package tw.org.iii;

import java.util.HashSet;

public class Java20170409_Collection_Hashset2 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		//基本型別會被auto-boxing
		set.add(12);
		set.add(12);
		set.add(12);
		//double會被auto-boxing為Double物件，所以不會重複
		set.add(12.0);
		set.add(50);
		set.add(12.5);
		//HashSet只會接收一次重複的元素
		set.add("Hiro");
		set.add("Hiro");
		set.add("Hiro");
		
		//toString()已經被overwrite，所以可以直接印出HashSet物件之內容
		System.out.println(set);
		
		for(Object obj : set)
		{
			System.out.println(obj);
		}
		
		//發5張不同的牌
		HashSet set2 = new HashSet();
		
		while(set2.size() < 2)
		{
			set2.add((int)Math.random()*3);
		}
		System.out.println(set2);


	}

}
