package BasicPrograms.basic;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * two string have same characters with the same length but order may differ.
		 * An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once.
            Examples of Anagrams:
            - Listen → Silent
            - Dormitory → Dirty room
            - School master → The classroom
            - Astronomer → Moon starer
            - Brag -> Grab
		 */
		
		String s1 = "Brag";
		String s2 = "Grab";

        if(AnagramChecker(s1, s2)){
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        }
        else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }

        // using for loop
        if(AnagramChecker2(s1, s2)){
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        }
        else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }

	}
	
	public static boolean AnagramChecker(String s1, String s2){
        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()){
            return false;
        }
        // Convert strings to char arrays and sort
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }

    public static boolean AnagramChecker2(String s1, String s2){
        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()){
            return false;
        }
        //1. using for loop
			int count = 0;
			for(int i=0; i<s1.length(); i++) {
				for(int j=0; j<s2.length(); j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						count++;
						break;
					}

				}
			}

			if(count==s1.length()) {
				return true;
			}
			else {
                return false;
			}
    }

}
