package Collection.List;

import java.util.AbstractList;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractList<Object> l = new ArrayList<Object>();
		l.add("A");
		l.add(10);
		l.add(null);
		l.add(1.55);
		System.out.println(l);
	}

}
