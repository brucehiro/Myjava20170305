package tw.org.iii;

import java.util.LinkedList;

public class Java20170409_Collection_List {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("B");
		list1.add("A");
		list1.add("B");
		list1.add("C");
		System.out.println(list1);
		//會由結構中移出第一個遇到的所指定之字串，或是指定index。而remove會回傳該物件，所以可以接收到別的變數中，只是由結構中移出。
		//removeAll可以移出整個collection，但只會回傳boolean。
		list1.remove("B");
		System.out.println(list1);
		
		System.out.println("----------");
		
		LinkedList<String> list2 = new LinkedList<>();
		//使用add(int index, e)，按照索引值插入元素，但index不可以大於目前的list1.size()，否則會出現超出index範圍的例外(runtime)				
		//當index皆為0的時候，舊資料會被新加入的資料往後擠，所以會印出C,B,A
		list2.add(0,"A");
		list2.add(0,"B");
		list2.add(0,"C");
		System.out.println(list2);
		//.get(index)可以取得指定index的元素值
		System.out.println(list2.get(0));


	}

}
