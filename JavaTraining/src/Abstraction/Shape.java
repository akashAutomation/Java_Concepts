package Abstraction;

public abstract class Shape {

	/*
	 * 1. Abstraction --> It is a process of hiding the implementation details
	 * 2. By abstract class we can achieve partial(0-100%) abstraction
	 * 3. In abstract class can have all abstract methods or combination of abstract and non abstract methods or all non abstract methods
	 * 4. We can create constructor of abstract class
	 * 5. We can not create the object of abstract classes
	 * 6. We can define variable as static, non static and final in abstract class
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
