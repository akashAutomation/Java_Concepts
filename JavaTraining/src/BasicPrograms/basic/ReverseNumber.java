package JavaTraining.src.BasicPrograms.basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		
	//1. using algorithm
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 +  num%10;
			num = num/10;
		}		
		System.out.println(rev);
	
	//2. using StringBuffer class
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		System.out.println(rev);
		
	//3. using StringBuilder class
//		StringBuilder sb = new StringBuilder();
//		sb.append(num);
//		StringBuilder rev = sb.reverse();
//		System.out.println(rev);	

	}

}
