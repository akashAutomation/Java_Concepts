package BasicPrograms.basic;

public class RemoveExtraSpacesFromString {

	public static void main(String[] args) {
		//with inbuilt func
		String s ="a b   c     de  f";
		s = s.replaceAll("\\s", "");
		System.out.println(s); //abcdef

		//without inbuilt func
		String s2 ="a b   c     de  f";
		String s3 = "";
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)!=' ') {
				s3 = s3+s2.charAt(i); //abcdef
			}
		}
		System.out.println("s3 = "+s3);
		
		// remove extra spaces
		String s1 ="a b   c     de  f";
		s1 = s1.replaceAll("\\s+", " ");
		System.out.println(s1); //a b c de f
	}

}
