package BasicPrograms.basic;

public class MissingNumberInArray {

	public static void main(String[] args) {
		/*
		 * rule : 1. Array should not have duplicate 
		 *        2. No need to be sorted order
		 *        3. values should be in range
		 */
		
		int a[] = {1,2,4,5};
		int sum1 = 0; // for start num to end number
		int sum2 = 0; // sum of numbers present in array
		for(int i=1; i<=5; i++) {
			sum1 = sum1+i;
		}
		
		for(int i=0; i<a.length; i++) {
			sum2 = sum2+a[i];
		}
		
		System.out.println("missing number = "+(sum1-sum2));
		

	}

}
