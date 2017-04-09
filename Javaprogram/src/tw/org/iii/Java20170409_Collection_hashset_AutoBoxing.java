package tw.org.iii;

import java.util.HashSet;
import java.util.Iterator;

public class Java20170409_Collection_hashset_AutoBoxing {

	public static void main(String[] args) {
	//boxing，將基本型別轉為物件。輸入可為int或string。string內容需為數值。
		
		Integer i1 = new Integer(12);
		Integer i2 = new Integer("12");
		//可以直接將基本型別賦予給i3，來做出物件實體。此為auto-boxing。
		Integer i3 = 56;
		//直接標準輸出物件時，會輸出物件之記憶體位置。因為物件名稱即為一指向該物件的指標。
		//當直接印出物件時，會直接執行.toString()。Object的.toString()為印出記憶體位置。
		//然而有些物件有overwrite.toString()，如Integer、String。Integer.toString()會印出參數的整數值，所以直接標準輸出Integer物建會印出其boxing的數值。
		System.out.println(i1);
		System.out.println(i3);
		//因為i3已經為物件，所以可以使用Integer類別中的方法。.floatValue()可以回傳浮點數值。
		System.out.println(i3.floatValue());
		
	//HashSet
		
		HashSet hSet = new HashSet();
		
		//hSet.add(物件)需要以物件作為參數
		int i4 = 12;
		Integer i5 = new Integer(34);
		hSet.add(i5);
		// i4 => auto-boxing => new Integer(i1)
		hSet.add(i4); 
		System.out.println(hSet.size());
		//因為HashSet的父類別中已有overwrite .toString()，所以直接印出HashSet類別物件，可以印出其內容值
		System.out.println(hSet);
		System.out.println("----------");
		
	//取出HashSet元素
		
		//(1)Iterator
		//因為HashSet類別中沒有取出元素的方法，所以要用iterator的方法來取出元素
//		Iterator it = hSet.iterator();
//		
//		while (it.hasNext())//.hasNext()當有下一個元素時為true
//		{
//			//由於Iterator的.next回傳值為object，所以要用object物件接收其值
//			Object obj = it.next();
//			//強制轉型回Integer類別並傳給Integer類別物件
//			Integer i = (Integer)obj;
//			System.out.println(i.floatValue());
//		}
		
		//(2)for-each
		for(Object obj : hSet)
		{
			System.out.println((Integer)obj);
			//即使直接標準輸出obj也會輸出元素數值而非記憶體位置，是因為雖然是印object類別物件，但因為其本質為Integer，所以其.toStirng()已經被overwrite了。此為多型導致的結果。
			System.out.println(obj);
			//因為有auto-unboxing，又因為所傳入的obj原本為int boxing而來，所以可以轉型回基本型別int
			System.out.println((int)obj);
			//雖然在編譯時可以轉為boolean，但是由於Integer物件無法轉型為boolean物件，在執行時會出現例外。
//			System.out.println((boolean)obj);
			
		}
		

	}

}
