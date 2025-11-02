package JavaTraining.src.BasicPrograms.basic;

public class FindAllSubsetOfString {

	public static void main(String[] args) {
		/*
		 * 1. The subset of a string is the character or the group of characters that
		 *    are present inside the string.
		 * 2. formula to find all the possible subsets for a string will be n(n+1)/2.
		 * 3. Ex.-> all possible subset of "CAT" will be C,A,T,CA,AT,CAT.   
		 */

		String s = "cat";
		int len = s.length();
		System.out.println("formula = "+ len*(len+1)/2);
		String arr[] = new String[len*(len+1)/2];
		int temp=0;

		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				arr[temp]=s.substring(i, j+1);
				temp++;
			}
		}
		
		for(String ss : arr) {
			System.out.println(ss);
		}
	}

}
