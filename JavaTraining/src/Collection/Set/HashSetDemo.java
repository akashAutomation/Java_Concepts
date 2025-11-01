package JavaTraining.src.Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> l = new HashSet<Object>();
		l.add("A");
		l.add(10);
		l.add(null);
		l.add(1.55);

		System.out.println(l); //[null, A, 1.55, 10]
		System.out.println(l.add("A")); //false
		System.out.println(l.add("a")); //true
		
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1,6,3,2,5,7,9));
		Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(4,2,5,6,8,9,10));
		
		// get the union
		Set<Integer> union = new HashSet<Integer>(s1);
		union.addAll(s2);
		System.out.println("union "+union);
		
		// get the intersection
		Set<Integer> intersection = new HashSet<Integer>(s1);
		intersection.retainAll(s2);
		System.out.println("intersection "+intersection);
		
		// get the difference
		Set<Integer> difference = new HashSet<Integer>(s1);
		difference.removeAll(s2);    // it will remove common element from difference that present in s2
		System.out.println("difference "+difference);
		
		
	}

}
