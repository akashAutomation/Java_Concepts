package Collection.Set;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {

	enum e {
		a, c, b, d, e
	}
	public static void main(String[] args) {
		/*
		 * 1. It is not synchronized
		 * 2. Faster than hashset
		 * 3. all the methods are implemented using bitwise arithmetic operations.
		 */
		
		EnumSet<e> s1 = EnumSet.allOf(e.class);
		System.out.println(s1); //[a, c, b, d, e]
		
		// blank enum set
		EnumSet<e> s2 = EnumSet.noneOf(e.class);
		System.out.println(s2); //[]
		
		//range(e,e) --> return a enum set with value from a to d
		EnumSet<e> s3 = EnumSet.range(e.a, e.d);
		System.out.println(s3); //[a, c, b, d]
		
		//of --> create EnumSet with only a specific value
		EnumSet<e> s4 = EnumSet.of(e.b);
		System.out.println(s4); //[b]
		
		EnumSet<e> s5 = EnumSet.of(e.b, e.e);
		System.out.println(s5); //[b, e]
		
		//add
		s5.add(e.a);
		System.out.println(s5);
		
		s5.addAll(s1);
		System.out.println(s5);
		
		// iterate
		Iterator<e> it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//remove
		s1.remove(e.a);
		System.out.println(s1);
		
		s1.removeAll(s1);
		System.out.println(s1);
	}

}
