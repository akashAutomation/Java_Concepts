package BasicPrograms.basic;

public class PalindromeString {

	public static void main(String[] args) {
		
		/*
		 * A palindrome string is a string that remains the same when its characters are reversed. 
		 *  ex.-> MADAM etc.
		 */
		
		String s = "MADAM";
		
		
	//1. using +(String concatenation) operator
		String rev = "";
			for(int i=s.length()-1; i>=0; i--) {
				rev = rev+s.charAt(i);
			}		
			System.out.println(rev);
			
			if(s.equalsIgnoreCase(rev)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
			
	//2. using StringBuffer class		
//			StringBuffer sb = new StringBuffer(s);
//			StringBuffer rev = sb.reverse();
//			System.out.println(rev);
//			int b = rev.compareTo(new StringBuffer(s));
//			System.out.println("b "+b);
//			if(b==0) {
//				System.out.println("palindrome");
//			}
//			else {
//				System.out.println("not palindrome");
//			}
			
					
	}	

}
