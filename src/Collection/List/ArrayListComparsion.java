package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparsion {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("a","b","c", "d"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("a","b","c", "e"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("c","b","a", "d"));
		
		// 1. sort and then equals --> need to sort first because equals() checks index by index
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		System.out.println(l1.equals(l2));  //false		
		System.out.println(l1.equals(l3));  //true
		
		// 2. find out the additional elements
		l1.removeAll(l2);
		System.out.println(l1); //[d]
		
		// 3. find out common elements
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("a","b","c", "d"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("a","b","c", "e"));
		l4.retainAll(l5);
		System.out.println(l4);
	}

}
