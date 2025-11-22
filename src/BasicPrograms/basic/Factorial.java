package BasicPrograms.basic;

public class Factorial {

	static int factorial = 1;
	public static void main(String[] args) {
		// A factorial is a function that multiplies a number by every number below it.
		
		int num = 5;
	
	//1. in ascending  
//		int fact = 1;
//		for(int i=1; i<=num; i++) {
//			fact = fact*i;
//		}
//		System.out.println(fact);
		
	//2. in descending  
//		int fact = 1;
//		for(int i=num; i>=1; i--) {
//			fact = fact*i;
//		}
//		System.out.println(fact);
		
	//3. using while 	
//		int fact = 1;
//		
//		while(num>1) {		
//			fact = fact*num;
//			num--;
//		}
//		System.out.println("fact = "+fact);
		
	//4. using recursion
		int fact = factorialUsingRecursion(num);
		System.out.println("factorial = "+fact);
	}
	
	public static int factorialUsingRecursion(int num) {
		if(num>1) {
			return (num*factorialUsingRecursion(num-1));
//			factorial = factorial*num;
//			factorialUsingRecursion(num-1);
		}
		return 1;
	}

}
