package JavaTraining.src.BasicPrograms.basic;

public class ReverseString {

	public static void main(String[] args) {
		String s = "abcde";
		String rev = "";
		
	//1. using +(String concatenation) operator
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}		
		System.out.println(rev);
		
	//2. using char array
//		char c[] = s.toCharArray();
//		for(int i = c.length-1; i>=0; i--) {
//			rev = rev + c[i];
//		}
//		System.out.println(rev);
		
	//3. using StringBuffer class		
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());
		
	//4. using StringBuilder class
//		StringBuilder sb = new StringBuilder(s);		
//		System.out.println(sb.reverse());	


	}

}
