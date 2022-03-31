package BasicPrograms.basic;

public class CountCharOuccurance {

	public static void main(String[] args) {
		String s = "abaccbaba";
		int beforeLen = s.length();
		
		s = s.replace("a", "");
		int afterLen = s.length();
		System.out.println("occurance of a = "+(beforeLen-afterLen));
		

	}

}
