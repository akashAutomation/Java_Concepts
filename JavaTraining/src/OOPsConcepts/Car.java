package OOPsConcepts;

// Class and Objects 

public class Car {
	
	//Class variable or Global variable
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		// new Car(); --> this is the object of Car class
		// new keyword is used to create the object
		// a,b,c --> Object Reference Variable
		// Whenever you create an object as static or local, it gets stored in Heap
		// Object Reference Variable is created in Stack and holds the address of object which is present in the Heap
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 5;
		
		c.mod = 2013;
		c.wheel = 6;
						
		System.out.println(a.mod +"-"+a.wheel);
		System.out.println(b.mod +"-"+b.wheel);
		System.out.println(c.mod +"-"+c.wheel);
		
	}
}
