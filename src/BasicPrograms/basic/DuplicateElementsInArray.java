package BasicPrograms.basic;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String a[]= {"ab", "ab", "abc", "abcd", "abc", "ab"};

		Map<String, Integer> map = new HashMap<>();
		for(String s:a){
			map.put(s, 0);
		}

		for(String s : a){
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}
		}

		for(Map.Entry<String, Integer> entry: map.entrySet()){
			if(entry.getValue()>1){
				System.out.println("key --> "+entry.getKey()+", value --> "+entry.getValue());
			}
		}

	}

}
