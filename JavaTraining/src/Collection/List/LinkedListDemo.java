package JavaTraining.src.Collection.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<Object>();
		l.add("a");
		l.add(30);
		l.add(null);
		l.add(1.454);
		System.out.println(l); //[a, 30, null, 1.454]
		
		l.set(0, "b");
		System.out.println(l); //[b, 30, null, 1.454]
		l.add(0, "c");
		System.out.println(l); //[c, b, 30, null, 1.454]
		
		l.removeLast();
		System.out.println(l); //[c, b, 30, null]
		l.addFirst("d");
		System.out.println(l); //[d, c, b, 30, null]
		
		//reverse the linkedList
		Iterator<Object> it = l.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		
		
	}

}
