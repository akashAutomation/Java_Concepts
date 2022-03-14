package Abstraction;

public abstract class Shape {

	/* Abstract means partially completed or implemented.
	 * 1. Abstraction --> It is a process of hiding the implementation details.
	 * 2. By abstract class we can achieve partial(0-100%) abstraction.
	 * 3. In abstract class can have all abstract methods or combination of abstract and non abstract methods or all non abstract methods
	 * 4. We can create constructor of abstract class.
	 * 5. We can not create the object of abstract classes.
	 * 6. We can define variable as static, non static and final in abstract class.
	 * 7. If a class contains atleast one abstract method compulsory we have to declare class as abstract.
	 * 8. If a class not contains any abstract method still we can declare class as abstract.
	 * 9. Child class is responsible to provide implementation for parent class abstract methods.
	 * 10. When we are extending abstract class then for each and every abstract method of abstract class, compulsory we should provide
	 *     implementation in the child class.
	 * 	    
	 */	
	
	int color;
	static int a;
	final int b = 2;
	
	abstract void drwaing(); // abstract method --> no method body
	
	public void fill() {  // non abstract method
		System.out.println("Shape --> fill()");
	}
	
	Shape(){
		System.out.println("Shape --> constructor");
	}
}
