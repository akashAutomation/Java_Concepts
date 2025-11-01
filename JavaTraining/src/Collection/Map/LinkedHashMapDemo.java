package JavaTraining.src.Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		/*
		 * 1. Maintain Insertion Order --> stores the values in a node(Doubly Linked list) 
		 * 2. not synchronized
		 * 3. default capacity 16
		 */
		
		LinkedHashMap<Integer, String> m1 = new LinkedHashMap<Integer, String>();
		m1.put(1, "A");
		m1.put(3, "B");
		m1.put(2, "C");
		m1.put(5, "D");
		m1.put(4, "E");
		
		System.out.println(m1);
	}

}
