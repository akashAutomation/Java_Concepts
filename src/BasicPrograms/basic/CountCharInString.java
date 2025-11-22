package BasicPrograms.basic;

public class CountCharInString {

	public static void main(String[] args) {
		String s = "hello world";

        //1
        s=s.replaceAll("\\s","");
        System.out.println(s.length());



        // 2
//      int count = 0;
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i) != ' ' ) {
//				count++;
//			}
//
//		}
//		System.out.println(count);

	}

}
