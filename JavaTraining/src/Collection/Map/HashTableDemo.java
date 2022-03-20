package Collection.Map;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashTableDemo {

	public static void main(String[] args) {
		/*
		 * 1. Legacy collection API or Legacy Map because it is old class
		 * 2. it is synchronized or Thread safe 
		 * 3. It does not allow any null key or null value  --> give NullPointerException
		 * 4. Initial capacity = 11 and load factor = 0.75
		 * 
		 */
		
		Hashtable<Integer, String> m1 = new Hashtable<Integer, String>();
		m1.put(1000, "A");
		m1.put(3000, "B");
		m1.put(2000, "C");
		m1.put(5000, "D");
		m1.put(4000, "E");
		//m1.put(null, "F"); --> not allowed
		//m1.put(5000, null); --> not allowed
	}

}
