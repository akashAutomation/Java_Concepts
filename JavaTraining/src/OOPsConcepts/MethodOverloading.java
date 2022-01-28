package OOPsConcepts;


// Method Overloading --> when the method name is same with different arguments or parameter with in the same class.

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum("Akash");
		obj.sum(10,20);
		obj.sum(10,"abc");
		main(2);
		main("main()");
	}
	
	// We can overload main() as below:
	
	public static void main(int i) {
		System.out.println("int i = "+i);
	}
	
	public static void main(String i) {
		System.out.println("String i = "+i);
	}

	/*
	 * 1. You can not create a method inside a method 
	 * 2. Same method name with same number and same data type of arguments are not allowed
	 * 	  ex.-> sum(int, int) and sum(int, int) are not allowed 
	 * 3. Same method name with same number and different data type of arguments are allowed 
	 *    ex.-> sum(int, String) and sum(String, int) are allowed
	 */	
	
	public void sum() {
		System.out.println("0 param");		
	}
		
	public void sum(int i) {
		System.out.println("1 param = "+i);		
	}
	
	public void sum(String i) {
		System.out.println("1 param = "+i);		
	}
	
	public void sum(int i, int j) {
		System.out.println("2 param = "+(i+j));
	}
	
	public void sum(int i, String j) {
		System.out.println("2 param = "+i+" and "+j);
	}
}
