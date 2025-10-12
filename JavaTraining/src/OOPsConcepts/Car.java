package JavaTraining.src.OOPsConcepts;

/* 1. Class --> A class is a group of objects which have common properties. It is a template or blueprint from which 
			objects	are created. It is a logical entity. It can not be physical.
	
   2. When we create any class in java then always it's parent class will be "Object" class which is present in java.lang package.
   3. Object class is the root of the class hierarchy
   4. If we are not extending any class in child class then always it's parent or super class will be Object class by default.
   5. If we are extending any class in child class then Object class will not be its parent class, but indirectly it will be
      it's super class
      ex-> class A extends B --> here parent class of A is B and suppose B is not extending any class then Object class will be parent class
           of B and indirectly Object class will be super class of A also.
   6. One child class can have only one parent class.
      ex:   class Child extends Parent {} -> correct
            class Child extends Parent1, Parent2 { // ❌ Not allowed in Java}
   7.A single .java file can contain multiple classes, but only one public class, and the file name must match that public class.
     If there’s no public class, the file name is flexible(ex: any_name.java).

            
	
   Object --> Object is an instance of a class. An entity that has state and behavior is known an object.
   		      It can be physical or logical.
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
		 * 6. All non-Static global var. is a part of objects so it gets stored in heap
		 * 7. All Static methods and var. gets stored in Metaspace
		 * 8. All non-Static methods and var. gets stored in Stack except non-static global var.
		 * 9. All local var. gets stored in Stack 
		 * 10. Objects are created dynamically 
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
