package Collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet l = new HashSet();
		l.add("A");
		l.add(10);
		l.add(null);
		l.add(1.55);

		System.out.println(l); //[null, A, 1.55, 10]
		System.out.println(l.add("A")); //false
		System.out.println(l.add("a")); //true
	}

}
