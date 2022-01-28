package OOPsConcepts;

public class MethodsInJava {

	// 1. main() --> starting point of execution
	// 2. main() is void because we never write return statement inside the main
	// 3. If you try to write return statement in main() then it will give you error at runtime
	// 	  Error: Main method must return a value of type void in class OOPsConcepts.MethodsInJava, please 
	//	  define the main method as: public static void main(String[] args)		  
	
	public static void main(String[] args) {		
		// 1. We have to create object to call non static methods in main()
		// 2. After creating the object, the copy of all non static methods will be given in that object
		
		MethodsInJava obj = new MethodsInJava();
		obj.test1();
		
		int  i = obj.test2();
		System.out.println(i);
		
		int  j = obj.test3(2, 1);
		System.out.println(j);
		
	}
	
	// all below methods are non static methods
	
	// no input, no output
	public void test1() {
		System.out.println("test1");
	}

	// no input, some output
	public int test2() {
		System.out.println("test2");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	// some input, some output
	public int test3(int x, int y) {
		System.out.println("test3");
		int z = x+y;
		
		return z;
	}
	
}
