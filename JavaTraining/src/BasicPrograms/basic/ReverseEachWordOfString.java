package BasicPrograms.basic;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String s = "Welcome to java";				
		String rev = "";
		
	//1. reverse the whole string
//		for(int i=s.length()-1; i>=0; i--) {
//			rev = rev+s.charAt(i);
//		}
//		System.out.println(rev); // "avaj ot emocleW"
		
	//2. reverse the whole string using split()
		String arr[] = s.split(" ");
		for(int j=arr.length-1; j>=0; j--) {
			String rev1 = "";
			for(int i=arr[j].length()-1; i>=0; i--) {
				rev1 = rev1+arr[j].charAt(i);
			}
			rev=rev+rev1+" ";
		}
		System.out.println(rev); // "avaj ot emocleW"

		
	//3. reverse the words and order remain same
//		String arr[] = s.split(" ");
//		for(String word : arr) {
//			String rev1 = "";
//			for(int i=word.length()-1; i>=0; i--) {
//				rev1 = rev1+word.charAt(i);
//			}
//			rev=rev+rev1+" ";
//		}
//		System.out.println(rev); // "emocleW ot avaj"
		
	

	}

}
