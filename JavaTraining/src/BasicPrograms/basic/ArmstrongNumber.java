package BasicPrograms.basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		/*
		 * A positive number is called Armstrong number if it is equal to the sum of its own digits
		 * each raised to the power of the total number of digits.
		 *   abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ... 
		 *  ex.-> 0 -> 0^1 = 0
		 *  	  1 -> 1^1 = 1
		 *      153 -> 1^3 + 5^3 + 3^3 = 153
		 *     1634 -> 1^4 + 6^4 + 3^4 + 4^4 = 1634 
		 */
		
//		int num = 9474;
//		int num2 = num;
//		int originalNum = num;
//		int finalsum = 0;
//		int power = 0;
//		
//		while(num>0) {
//			power++;
//			num = num/10;
//		}
//		System.out.println("power = "+num2);
//		
//		for(int i=1; i<=power; i++) {
//			int rem = num2%10;
//			int p = power;
//			int sum = 1; 
//			while(p>0) {
//				sum = sum*rem;
//				p--;
//				//System.out.println("p = "+power);
//			}
//			//System.out.println("sum" +sum);
//			finalsum = finalsum + sum;
//			num2 = num2/10;
//		}
//		
//		
//		System.out.println(finalsum);
//		if(finalsum==originalNum) {
//			System.out.println("Armstrong number");
//		}
//		else {
//			System.out.println("Not a Armstrong number");
//		}
		
	// print nth armstrong numbers
		int z = 1;
		for(int k=0; k<Integer.MAX_VALUE; k++) {
			int num = k;
			int num2 = num;
			int originalNum = num;
			int finalsum = 0;
			int power = 0;
			
			while(num>0) {
				power++;
				num = num/10;
			}
			//System.out.println("power = "+num2);
			
			for(int i=1; i<=power; i++) {
				int rem = num2%10;
				int p = power;
				int sum = 1; 
				while(p>0) {
					sum = sum*rem;
					p--;
					//System.out.println("p = "+power);
				}
				//System.out.println("sum" +sum);
				finalsum = finalsum + sum;
				num2 = num2/10;
			}
			
			
			//System.out.println(finalsum);
			if(finalsum==originalNum) {				
				System.out.println(z+". "+finalsum);
				z++;
				
			}
			
		}
		
		
	}

}
