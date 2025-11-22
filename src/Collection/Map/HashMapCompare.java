package Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "A");
		m1.put(2, "B");
		m1.put(3, "C");
		
		HashMap<Integer, String> m2 = new HashMap<Integer, String>();		
		m2.put(3, "C");
		m2.put(1, "A");
		m2.put(2, "B");
		
		HashMap<Integer, String> m3 = new HashMap<Integer, String>();				
		m3.put(1, "A");
		m3.put(2, "B");
		m3.put(3, "C");
		m3.put(3, "D");
		
		HashMap<Integer, String> m4 = new HashMap<Integer, String>();				
		m4.put(1, "A");
		m4.put(2, "B");
		m4.put(3, "C");
		m4.put(4, "D");
		
		HashMap<Integer, String> m5 = new HashMap<Integer, String>();				
		m5.put(1, "A");
		m5.put(2, "B");
		m5.put(3, "C");
		m5.put(4, "C");

        HashMap<Integer, String> m6 = new HashMap<Integer, String>();
        m6.put(3, "D");
        m6.put(1, "A");
        m6.put(2, "B");
		
		//1. on the basis of key-value --> using equals()
        System.out.println("---- on the basis of key-value --> using equals() ----");
		System.out.println(m1.equals(m2)); //true --> order doesn't matter
        System.out.println(m1.equals(m6)); //false
        System.out.println(m1.equals(m3)); //false

		
		//2. compare hashmap for the same keys --> using keySet()
        System.out.println("---- compare hashmap for the same keys --> using keySet()----");
		System.out.println(m1.keySet().equals(m2.keySet())); //true
		System.out.println(m1.keySet().equals(m3.keySet())); //true
		System.out.println(m1.keySet().equals(m4.keySet())); //false
		
		//3. find out extra keys
        System.out.println("---- find out extra keys ----");
		HashSet<Integer> h = new HashSet<Integer>(m1.keySet());
		h.addAll(m4.keySet());
		h.removeAll(m1.keySet());
		System.out.println(h);  //4
		
		//4. Compare map by values: duplicates allowed
        System.out.println("---- Compare map by values: duplicates allowed ----");
		System.out.println(new ArrayList<>(m1.values()).equals(new ArrayList<>(m2.values()))); //true
		System.out.println(new ArrayList<>(m1.values()).equals(new ArrayList<>(m5.values()))); //false
        System.out.println(new ArrayList<>(m1.values()).equals(new ArrayList<>(m6.values()))); //false
		
		//5. Compare map by values: duplicates not allowed
        System.out.println("---- Compare map by values: duplicates not allowed ----");
		System.out.println(new HashSet<>(m1.values()).equals(new HashSet<>(m2.values()))); //true
		System.out.println(new HashSet<>(m1.values()).equals(new HashSet<>(m5.values()))); //true
        System.out.println(new HashSet<>(m1.values()).equals(new HashSet<>(m6.values()))); //false
		
	}

}
