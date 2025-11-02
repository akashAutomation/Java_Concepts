package JavaTraining.src.BasicPrograms.basic;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * 1. Natural number > 1 
		 * 2. Which has only two factors 1 and itself
		 *    ex.-> 2,3,5,7,11,13,...
		 * 3. 1 is not a prime number
		 * 4. 2 is the only even prime number
		 */
		
		int num = 15;
		int count = 0;
		
		if(num>1) {
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("prime ");
			}
			else {
				System.out.println("not prime");
			}
		}
		else {
			System.out.println("not prime");
		}

	}

}
