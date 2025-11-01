package JavaTraining.src.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(101, "A");
		m1.put(102, "B");
		m1.put(103, "C");
		m1.put(104, "D");
		m1.put(105, "E");
		System.out.println(m1);
		
		ArrayList<Integer> key = new ArrayList<Integer>(m1.keySet());
		ArrayList<String> value = new ArrayList<String>(m1.values());
		
		System.out.println(key);	
		System.out.println(value);
		

	}

}
