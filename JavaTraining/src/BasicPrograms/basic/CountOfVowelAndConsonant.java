package BasicPrograms.basic;

public class CountOfVowelAndConsonant {

	public static void main(String[] args) {
		String s = "Hello World123";
		int vowel = 0, consonant = 0;
		
		s = s.toLowerCase();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || 
					s.charAt(i)=='u') {
				vowel++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				consonant++;
			}
		}
		
		System.out.println("vowel = "+vowel+", consonant = "+consonant);
		

	}

}
