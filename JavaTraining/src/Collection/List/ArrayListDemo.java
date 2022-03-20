package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList l = new ArrayList();
		ArrayList<Object> l = new ArrayList<Object>();
		l.add("A");
		l.add(10);
		l.add(null);
		l.add(1.55);
		
		/*
		 * 1. Whenever we try to print any object reference internally toString() will be called by default. In every collection toString() is 
		 * return "[]" so that our output will be under [].
		 */		
		System.out.println(l); //[A, 10, null, 1.55]
		l.remove(2);
		System.out.println(l); //[A, 10, 1.55]
		l.add(2, "M");
		l.add("N");
		System.out.println(l); //[A, 10, M, 1.55, N]
		
		// ways to itereate --> 1. by for loop:
        // 2. by for each
		  System.out.println("----------");
		  for(Object o : l) {
			 System.out.println(o); 
		  }
		
		  // 3. by stream with lamda 
		  System.out.println("----------");		  
		  l.stream().forEach(a -> System.out.println(a));
		  
		  // 4. by iterator
		  System.out.println("----------");
		  Iterator<Object> it = l.iterator();
		  
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  
		  System.out.println("contains =" +l.contains("A"));
		  
		  ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		  System.out.println("sublist = "+a.subList(2, 6));
		  a.removeIf(s -> s%2 == 0);
		  System.out.println(a);
		 
		  
		  ArrayList<String> b = new ArrayList<String>(Arrays.asList("A","b","c","a"));
		  l.retainAll(b);
		  System.out.println("retain all = "+l);
	}

}
