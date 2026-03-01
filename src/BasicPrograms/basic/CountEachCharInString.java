package BasicPrograms.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachCharInString {

	public static void main(String[] args) {
	//1. for each characters		
//		String s = "hello world java hello world";
//		s = s.toLowerCase();
//		s = s.replaceAll(" ", "");
//
//		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//		for(int i=0; i<s.length(); i++) {
//			int count=0;
//			for(int j=0; j<s.length(); j++) {
//				if(s.charAt(i)==s.charAt(j)) {
//					count++;
//				}
//			}
//			map.put(s.charAt(i), count);
//		}
//
//		System.out.println(map);
		
	//2. for each word	
		String s1 = "hello world java Hello World";
		s1 = s1.toLowerCase();
		String arr[] = s1.split(" ");
			Map<String, Integer> map = new LinkedHashMap<String, Integer>();
			for(int i=0; i<arr.length; i++) {
				int count=0;
				for(int j=0; j<arr.length; j++) {
					if(arr[i].equals(arr[j])) {
						count++;
					}
				}
				map.put(arr[i], count);
			}

			System.out.println(map);


	//3. print 1st non-repeatable char, ex: in "swiss" -> w is the 1st non-repeatable char
//		String s = "swiss";
//		Map<Character,Integer> map = new LinkedHashMap<>();
//		for(char c: s.toCharArray()){
//			map.put(c,0);
//		}
//
//		for(char c : s.toCharArray()){
//			if(map.containsKey(c)){
//				map.put(c, map.get(c)+1);
//			}
//		}
//
//		System.out.println(map);
//		for(Map.Entry<Character, Integer> entry: map.entrySet()){
//			if(entry.getValue()==1){
//				System.out.println(entry.getKey()+" -> "+entry.getValue());
//				return;
//			}
//		}

	}



}
