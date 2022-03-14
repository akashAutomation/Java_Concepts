package OOPsConcepts;

import BasicConcepts.AccessModifiers;

public class AceessModifierTest extends AccessModifiers {

	public static void main(String[] args) {
		AceessModifierTest a = new AceessModifierTest();
		System.out.println(a.b);  // public members can be accessible in different package
		System.out.println(a.c);  //protected members can be accessible in child class of different package
//		System.out.println(a.d);  --> default members can not accessible in different package		
	}
}	



