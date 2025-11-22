package BasicPrograms.basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		/*
		 * An Armstrong number is a number that equals the sum of its own digits each raised to the power of the number of digits.
		 * An n-digit number is called an Armstrong number if:
                abcd...=a^n+b^n+c^n+d^n+...
                Where:
                        - a,b,c,d are the digits of the number
                        - n is the total number of digits

		 *  ex.-> 0 -> 0^1 = 0
		 *  	  1 -> 1^1 = 1
		 *      153 -> 1^3 + 5^3 + 3^3 = 153
		 *     1634 -> 1^4 + 6^4 + 3^4 + 4^4 = 1634 
		 */
//        int n = 1634;
//        if(armstrongChecker(n)){
//            System.out.println(n+" is a Armstrong number");
//        }
//        else{
//            System.out.println(n+" is not a Armstrong number");
//        }
		
	// print nth armstrong numbers
		int z = 1;
		for(int k=0; k<Integer.MAX_VALUE; k++) {
			if(armstrongChecker(k)) {
				System.out.println(z+". "+k);
				z++;
			}
		}
		
		
	}

    public static boolean armstrongChecker(int k){
        int tempnum = k;
        int sum = 0;

        int digits = Integer.toString(k).length();

        while (tempnum > 0) {
            int rem = tempnum % 10;
            sum = sum + (int)Math.pow(rem, digits);
            tempnum = tempnum/ 10;
        }
        return sum == k;
    }

    public static boolean armstrongChecker2(int k){
		int tempnum = k;
		int finalsum = 0;
		int power = 0;

		while(tempnum>0) {
			power++;
            tempnum = tempnum/10;
		}

        tempnum = k;
		for(int i=1; i<=power; i++) {
			int rem = tempnum%10;
			int p = power;
			int sum = 1;
			while(p>0) {
				sum = sum*rem;
				p--;
			}
			finalsum = finalsum + sum;
            tempnum = tempnum/10;
		}
        return finalsum == k;
    }

}
