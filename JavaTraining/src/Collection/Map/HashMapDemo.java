package Collection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		/*
		 * 1. no order - no indexing 
		 * 2. store values --> <key, value> 
		 * 3. key can not be duplicate, if there is duplicate key then it will give the latest value 
		 * 4. can store n number of null values but only one null key
		 * 5. HashMap is not thread safe - unsynchronized
		 * 6. Hash Code of null key is always zero. So null key and it's value is always store in 0 index in map.
		 * 7. default initial capacity 16 & fill ratio 0.75
		 */		
		
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Wahington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("Russia", "Moscow");
		capitalMap.put("France", null);
		
		System.out.println(capitalMap);
		System.out.println(capitalMap.get("India")); //New Delhi
		System.out.println(capitalMap.get("UK")); //London11
		System.out.println(capitalMap.get(null)); //LA
		System.out.println(capitalMap.get("Brazil")); //null
		
		System.out.println("remove = "+capitalMap.remove("Russia")); // removes all the entry of Russia
		System.out.println("remove = "+capitalMap.remove("UK", "London11")); // removes only one entry of UK which value is London11.
		
		System.out.println("----------------1.--------------");
		
		//1. iterator --> apply iterator over the keys by using keySet()
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = "+key+" value = "+value);
		}
		
		System.out.println("-------------2.-----------------");
		
		//2. iterator --> apply iterator over the set(pair) by using entrySet()
		Iterator<Entry<String,String>> it1 = capitalMap.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
		}
		
		System.out.println("3.-----------3.----------------");
		
		//3. iterate hashmap using java 8 for each and lambda
		capitalMap.forEach((k,v) -> System.out.println("key = "+k+" value = "+v));
		
		//4. immutable Map with only one single entry --> we can not change or add entry in immutable map
		Map<Integer, String> m1 = Collections.singletonMap(1, "a"); // using singletonMap() we can only add single entry
		System.out.println(m1.get(1));
		// m1.put(2,"b"); --> UnsupportedOperationException 
		
		//5. empty map
		Map<Integer, String> m2 = Map.of();
		//m2.put(11, "aa"); --> UnsupportedOperationException
		
		//6. singleton map
		Map<Integer, String> m3 = Map.of(111, "aaa");
		//m3.put(2, "a"); --> UnsupportedOperationException
	}

}
