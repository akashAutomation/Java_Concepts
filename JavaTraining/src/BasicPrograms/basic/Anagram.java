package BasicPrograms.basic;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * two string have same characters with the same length but order may differ.
		 * ex.-> "Brag", "Grab"
		 */
		
		String s1 = "Brag";
		String s2 = "Grab";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length()==s2.length()) {
		//1.	
//			int count = 0;
//			for(int i=0; i<s1.length(); i++) {
//				for(int j=0; j<s2.length(); j++) {
//					if(s1.charAt(i)==s2.charAt(j)) {
//						count++;
//						break;
//					}
//					
//				}
//			}
//			
//			if(count==s1.length()) {
//				System.out.println("anagram");
//			}
//			else {
//				System.out.println("not anagram");
//			}
			
		// 2. By sorting of both strings
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
			
			
		}
		else {
			System.out.println("not anagram");
		}
	}
	
	

}
