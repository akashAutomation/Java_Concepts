package JavaTraining.src.BasicPrograms.basic;

public class LargestAmong3Numbers {

	public static void main(String[] args) {
		int a=1, b=2, c=3;
		
	//1. simple logic
//		if(a>b && a>c) {
//			System.out.println("largest = "+a);
//		}
//		else if(b>a && b>c) {
//			System.out.println("largest = "+b);
//		}
//		else {
//			System.out.println("largest = "+c);
//		}

	//2. using ternary operator
//		int largest1 = a>b?a:b;  //if a is largest then give a otherwise b
//		int largest2 = c>largest1?c:largest1; //if largest1 is largest then give largest1 otherwise c
//		System.out.println(largest2);
	
	
	//3. using ternary operator in single statement
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest);
	}

}
