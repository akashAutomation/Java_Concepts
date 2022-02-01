package Inheritance;

public class BMW extends Car{  // "Has-a relationship" --> Class to class relationship
	
	/*
	 * Method Overriding --> When some method is present in parent class as well as child class with the same name
	 * 						 and same number of arguments, is called Method Overriding.
	 */

	public void start() {  // Overridden method
		System.out.println("BMW --> start");
	}
	
	public void theftSafety() {
		System.out.println("BMW --> theftSafety");
	}

}
