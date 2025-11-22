package FinalFinallyFinalizeConcept;

public class Finally {

	/*
	 * 1. By using finally keyword we can execute those lines which are present in finally block even after throwing any exception 
	 * 2. finally is always used with try block
	 * 3. Any execution is coming or not, finally block is always executed.
	 */	
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}

	public static void test1() {
		try {
			System.out.println("inside test1() try");
			throw new RuntimeException();
		}
		catch(Exception e) {
			System.out.println("inside catch -> "+e);
		}
		
		finally {
			System.out.println("inside finally"); 
		}
	}
	
	public static void test2() {
		try {
			System.out.println("inside test2() try");			
		}
		finally {
			System.out.println("inside finally"); 
		}
	}
	
	public static void test3() {
		int i = 10;		
		try {
			System.out.println("inside test3() try");
			int k = i/0;  //this line will give ArithmeticException because we can not divide any value by zero in java
		}
		catch(ArithmeticException e) {
			System.out.println("inside catch -> "+e);
		}		
		finally {
			System.out.println("inside finally"); 
		}
	}
	
	/*
	 * Here, we have not handled ArithmeticException so it will not go inside the catch block
	 * Then it will execute finally block then it will throw exception
	 */	
	public static void test4() {
		int i = 10;		
		try {
			System.out.println("inside test4() try");
			int k = i/0;  //this line will give ArithmeticException because we can not divide any value by zero in java
		}
		catch(NullPointerException e) { // So it will not go inside the catch block
			System.out.println("inside catch -> "+e);
		}		
		finally {
			System.out.println("inside finally"); 
		}
	}

}
