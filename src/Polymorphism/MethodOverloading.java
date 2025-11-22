package Polymorphism;


/* 1. Method Overloading --> when the method name is same with different arguments or parameter in same class.
   2. It is also called as Compile Time Polymorphism or Static Polymorphism or Early Binding.
   3. Compiler is responsible to perform method resolution(means which method is gone to be executed) that's why it is called compile time polymorphism.
   
   4. If more than 2 methods of a class(Whether both declared in the same class, or one declared and one inherited) have the same name
      with different arguments or parameter then the method is said to be overloaded.
   5. Biggest advantage is that It provides more flexibility to programmer because complexity of programming is gone to be reduced.  
*/

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
//		obj.sum();
//		obj.sum(10);
//		obj.sum("Akash");
//		obj.sum(10,20);
//		obj.sum(10,"abc");
//		main(2);
//		main("main()");
//		
//		B b = new B();
//		b.f1(2);
		obj.sum(null);

        B b = new B();
        b.f1(1,2);
        b.f1(1,"a");
        b.f1(1);
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
		System.out.println("1 string param = "+i);		
	}
	
	public void sum(int i, int j) {
		System.out.println("2 param = "+(i+j));
	}
	
	public void sum(int i, String j) {
		System.out.println("2 param = "+i+" and "+j);
	}
}

class A{
	public void f1(int x) {
		System.out.println("f1() of class A ");
	}
}

class B extends A{
    /* If you try to create method with same name and arguments if it extends a class which already have identical method
        then it will show a warning msg "Method 'f1(int x)' is identical to its super method", and then
        it is called overriding not overloading.
    */

    public void f1(int x, int y) {
		System.out.println("f1() of class B ");
	}

    //overloading
    public void f1(int x, String y) {
        System.out.println("f1() of class A overloading ");
    }

    //overriding
    public void f1(int x) {
        System.out.println("f1() of class A overriding ");
    }
}
