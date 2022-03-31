package OOPsConcepts;

public class StaticAndNonStaticConcept {
	
	String name = "Akash";   // non static global var. or instance variable --> while creating a object then instance var is a part of that object. 
	static int age = 24;	 // static global var.

	public static void main(String[] args) {
		/*
		 * 1. There is 2 ways we can call static method and var.
		 * 		a. direct calling
		 * 		b. calling by class name
		 * 
		 * 2. We can call non static method and variables by creating object 
		 * 3. Static methods and variable are not part of any object
		 * 4. We can access static methods and variables by using object reference but it will give a warning
		 *    "The static field StaticAndNonStaticConcept.age should be accessed in a static way"
		 *    ex.->  int s = obj.age  --> It is not a good practice to call static methods and var by object reference
		 * 
		 * 5. Local variable can not be static. Only global variable can be static.
		 * 6. We can call main() inside a main() but it will run infinite time and at the end it will give a exception
		 * 		"java.lang.StackOverflowError". Here is Recursion concept applied.
		 * 
		 * 7. Recursion--> When a function is calling itself is called recursion.
		 * 8. We can have inner class as static.
		 * 9. Static functions can only access static members of the same class. We can not write instace var. inside static functions.
		 */	
		
		test2();
		StaticAndNonStaticConcept.test2();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.test1();
		System.out.println(StaticAndNonStaticConcept.Abc.country);
		//main(args);   // calling main()  --> Recursion
		
	}

	// non static method or instance member function
	public void test1() {
		System.out.println("test1");
	}
	
	// static method
	public static void test2() {
		System.out.println("test2");
	}
	
	// static inner class
	static class Abc{  
		static String country = "INDIA";
	}
}

class Test{
	
}
