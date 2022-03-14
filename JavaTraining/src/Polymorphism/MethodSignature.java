package Polymorphism;

public class MethodSignature {

	/*
	 * 1. Method Signature contains method name and argument type.
	 * 		ex.-> method1(String), method2(String, int) etc.
	 * 2. Compiler will use method signature while resolving method calls.
	 * 3. Two methods with a same signature in a same class is not allowed. ex.-> m1(int i) , m1(int j)
	 * 
	 */
	
	public void m1() {
		System.out.println("m1");
	}
	
	public void m2(int i) {
		System.out.println("m2 = "+i);
	}

	public void m3(String j) {
		System.out.println("m3 = "+j);
	}
	
	public static void main(String[] args) {
		MethodSignature obj =  new MethodSignature();
		obj.m1();
	}
}
