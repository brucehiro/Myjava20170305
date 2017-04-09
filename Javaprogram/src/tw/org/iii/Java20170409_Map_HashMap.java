package tw.org.iii;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Java20170409_Map_HashMap {

	public static void main(String[] args) {
		//Map類似structure
		HashMap<String,Object> map = new HashMap<>();
		//.put為加入key及對應的value
		map.put("name", "Hiro");
		map.put("tall", 162);
		map.put("gender", true);
		//取得某個key的value，用.get(key)
		System.out.println(map.get("tall"));
		//.put為取代某一個key的value，而非加入
		map.put("tall", 170);
		System.out.println(map.get("tall"));
		
		Set<String> set = map.keySet();
		
		for(String key : set)
		{
			System.out.println(key + ":" + map.get(key));
		}
		

	}

}
