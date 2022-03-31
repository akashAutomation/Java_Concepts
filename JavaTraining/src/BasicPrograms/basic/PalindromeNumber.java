package BasicPrograms.basic;

public class PalindromeNumber {

	public static void main(String[] args) {
		/*
		 * A palindrome number is a number that remains the same when its digits are reversed. 
		 *  ex.-> 16461, 151, 11, 121 etc.
		 */
		
		int num = 16461;
	
	//1. using algorithm
		int originalNum = num;		
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 +  num%10;
			num = num/10;
		}		
		System.out.println(rev);
		
		if(originalNum == rev) {
			System.out.println("Given number is palindrome number");
		}
		else {
			System.out.println("Given number is not palindrome number");
		}
		
	//2. using StringBuffer class
//		StringBuffer sb = new StringBuffer(String.valueOf(num));		
//		StringBuffer rev = sb.reverse();
//		System.out.println(rev);
//	
//		int b = rev.compareTo(new StringBuffer(String.valueOf(num)));
//		System.out.println("b "+b);
//		
//		if(b==0) {
//			System.out.println("Given number is palindrome number");
//		}
//		else {
//			System.out.println("Given number is not palindrome number");
//		}
	}

}
