package Constructor;

// with super keyword

public class B extends A{
	
	/*
	 * 1. When we create child class object then default constructor of parent class will be called first then default constructor 
	 *    of child class only if the child class extends parent class. 
	 *    ex-> Default constructor of A class will be called first then default constructor of B class
	 *    
	 * 2. If we will use super keyword in child class constructor and want to call parent class parameterized constructor then the parent 
	 *    class default constructor will not be called. It will called first parameterized constructor of parent class then default constructor
	 *    of child class 
	 *    
	 * 3. Super keyword is used to call parent class constructor.
	 * 4. It is possible to call default constructor of parent class by using super keyword and don't pass any value in super. If we will not use super then also we can call
	 *    default constructor of parent class. Mostly super keyword is used to call parameterized constructor of parent class.
	 *    ex-> super() -->  default constructor of parent class will be called 
	 *    
	 * 5. Super keyword should be written in child class constructor always and it should be the first statement.  
	 * 6. Inside a constructor we do not have more then one super keyword. If you want use muliple super keyword in a class then 
	 *    create multiple constructor in child class.    
	 */

	public B() {
		super();  // default constructor of parent class will be called
		//super(10, "abc");  --> this can not be done
		System.out.println("child class B cons" );
	}
	
	public B(int i) {
		super(10);
		System.out.println("child class B cons with value i = "+i);
	}
	
	public B(int i, String j) {
		super(10, "abc");
		System.out.println("child class B cons with value i = "+i+" and j ="+j);
	}
	
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(20);
		B obj2 = new B(30, "abcd");
	}
}
