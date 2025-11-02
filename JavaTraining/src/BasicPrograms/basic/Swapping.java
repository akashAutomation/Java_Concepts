package JavaTraining.src.BasicPrograms.basic;

public class Swapping {

	public static void main(String[] args) {
		int a=10, b = 20;
		
	//1. without using 3rd var
		a = a+b;
		b = a-b;
		a = a-b;		
		System.out.println("a = "+a+", b = "+b);
		
	//2. with using 3rd var
//		int t = a;
//		a = b;
//	    b = t;				
//		System.out.println("a = "+a+", b = "+b);
		
	//3. without using 3rd var using * and / --> here a and b values should not be zero otherwise give "ArithmeticException: / by zero"
//		a = a*b;
//		b = a/b;
//		a = a/b;
//		System.out.println("a = "+a+", b = "+b);
		
	//4. Single statement
//		b = (a+b) - (a=b);
//		System.out.println("a = "+a+", b = "+b);
	}

}
