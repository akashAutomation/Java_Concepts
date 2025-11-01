package JavaTraining.src.Collection.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		/*
		 * Vector is a legacy class of java.(present since initial version of java JDK 1.0)
		 * 1. Vector is dynamic and its size grows and shrink as elements are added or removed.
		 * 2. It is slower than array and arraylist
		 * 3. It is synchronized(Thread safe)
		 * 4. Insertion Order is preserved.
		 * 5. Null insertion is possible.
		 * 6. It uses Enumerator and iterator for traversing.
		 */		
		Vector<Integer> l = new Vector<Integer>();
		l.add(12);
		l.add(30);
		l.add(null);
		l.add(10);

		System.out.println(l);
		
		Iterator<Integer> it = l.iterator();
		  
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }

	}

}
