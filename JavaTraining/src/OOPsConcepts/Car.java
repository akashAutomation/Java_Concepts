package OOPsConcepts;

/* Class --> A class is a group of objects which have common properties. It is a template or blueprint from which 
			objects	are created. It is a logical entity. It can not be physical.
	
   Object --> Object is an instance of a class. An entity that has state and behavior is known an object.
   		      It can be physical or logical
*/

public class Car {
	
	//Class variable or Global variable
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		/*
		 * 1. new Car(); --> this is the object of Car class 
		 * 2. new keyword is used to create the object 
		 * 3. here a,b,c --> Object Reference Variable 
		 * 4. All objects are created in Heap
		 * 5. Object Reference Variable is stored in Stack and holds the address of object which is present in the Heap
		 * 6. All non Static global var. is a part of objects so it gets stored in heap
		 * 7. All Static methods and var. gets stored in Metaspace
		 * 8. All non Static methods and var. gets stored in Stack except non static global var.
		 * 9. All local var. gets stored in Stack 
		 */
		
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
