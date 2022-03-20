package Collection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "A");
		m1.put(2, "B");
		m1.put(3, "C");
		
		/*
		 * synchronized HashMap : 1. Thread safe 
		 * 						  2. Slow Performance
		 * 						  3. null key and multiple null values are allowed
		 */
		Map<Integer, String> m2 = Collections.synchronizedMap(m1);
		System.out.println(m2);
		
		/*
		 * ConcurrentHashMap --> In ConcurrentHashMap, object will be divided into 16 segments by default so that multiple threads
		 * 						 can do operations in different segments. 
		 * 						 ex-> one thread is trying to write in that object so it will occupy 1 segment and perform action, same time another thread
		 * 							  trying to write something in that object then it will occupy another segment and perform action. So multiple thread
		 * 							  perform action simultaneously. So that another thread can do work without waiting of thread 1 completion.     
		 * 						 
		 * 					     1. Thread safe
		 * 						 2. Fast Performance
		 * 						 3. null key and null values are not allowed --> give NullPointerException
		 * 						 4. It does not throw any ConcurrentModificationException
		 * 						 5. Multiple thread can not write in the same segment because once a thread occupy one segment then
		 * 							another thread will not come in that segment untill it's free from prevoius thread.
		 * 						 6. Multiple thread can read from the same segment.
		 * 						 7. If one thread is writing in a segment then another thread can read from that segment but in this case
		 * 							last updated will get by the reading thread.
		 */
		ConcurrentHashMap<Integer, String> m3 = new ConcurrentHashMap<Integer, String>();
		m3.put(1, "A");
		m3.put(2, "B");
		//m3.put(null, "C"); --> not allowed
		//m3.put(3, null); --> not allowed
		System.out.println(m3);
		
	}

}
