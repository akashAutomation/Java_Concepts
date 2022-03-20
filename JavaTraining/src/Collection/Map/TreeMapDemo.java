package Collection.Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		/*
		 * 1. Sorted Map --> store in ascending order by default 
		 * 2. sort the elements by Keys  
		 * 3. also called Red Black Tree
		 */
		
		TreeMap<Integer, String> m1 = new TreeMap<Integer, String>();
		m1.put(1000, "A");
		m1.put(3000, "B");
		m1.put(2000, "C");
		m1.put(5000, "D");
		m1.put(4000, "E");
		
		System.out.println(m1);
		System.out.println("last key = "+m1.lastKey()); //5000
		System.out.println("first key = "+m1.firstKey()); //1000
		System.out.println("first Entry = "+m1.firstEntry()); //1000=A
		System.out.println("last Entry = "+m1.lastEntry()); //5000=D
		System.out.println("higher Entry = "+m1.higherEntry(3000)); //4000=E
		System.out.println("lower Entry = "+m1.lowerEntry(3000)); //2000=C
		
		// get entry which is less then 3000
		Set<Integer> s = m1.headMap(3000).keySet();
		System.out.println(s); //[1000, 2000]
		
		// get entry which is greater then and equal to 3000
		Set<Integer> s1 = m1.tailMap(3000).keySet();
		System.out.println(s1); //[3000, 4000, 5000]
		
		// descending order
		TreeMap<Integer, String> m2 = new TreeMap<Integer, String>(Comparator.reverseOrder());
		m2.put(1000, "A");
		m2.put(3000, "B");
		m2.put(2000, "C");
		m2.put(5000, "D");
		m2.put(4000, "E");
		System.out.println(m2);
	}

}
