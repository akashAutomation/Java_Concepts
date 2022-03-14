package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add(null);
		l.add(1.55);
		
		/*
		 * Whenever we try to print any object reference internally toString() will be called by default. In every collection toString() is 
		 * return "[]" so that our output will be under [].
		 */		
		System.out.println(l); //[A, 10, null, 1.55]
		l.remove(2);
		System.out.println(l); //[A, 10, 1.55]
		l.add(2, "M");
		l.add("N");
		System.out.println(l); //[A, 10, M, 1.55, N]

	}

}
