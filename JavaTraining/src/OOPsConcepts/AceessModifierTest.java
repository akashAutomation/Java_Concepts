package OOPsConcepts;

import BasicConcepts.Abc;
import BasicConcepts.AccessModifiers;

public class AceessModifierTest extends Abc {

	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		System.out.println(a.b);
//		System.out.println(a.c);
//		System.out.println(a.d);		
	}
}	
	
class Az {
	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		System.out.println(a.b);
		//System.out.println(a.c);
		//System.out.println(a.d);
		
	}
}


