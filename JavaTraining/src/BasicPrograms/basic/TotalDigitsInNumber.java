package BasicPrograms.basic;

import java.util.stream.Stream;

public class TotalDigitsInNumber {

	public static void main(String[] args) {
		int num = 123450;
		
	//1. using algorithm	
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}		
		System.out.println(count);
		
	//2. using int to string conversion	
//		String s = Integer.toString(num);
//		System.out.println(s);
//		System.out.println("s = "+s.length());

	}

}
