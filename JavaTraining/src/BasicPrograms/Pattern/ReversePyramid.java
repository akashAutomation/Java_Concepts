package BasicPrograms.Pattern;

public class ReversePyramid {

	public static void main(String[] args) {
	//1. *
		for(int i=5; i>=1; i--) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("-----------------------");

	//2. *
		for(int i=5; i>=1; i--) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int m=2; m<=i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");			
	
	//3. number
		for(int i=5; i>=1; i--) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
		System.out.println("-----------------------");		

	//4. number
		int temp=1;
		for(int i=5; i>=1; i--) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" "+(temp++));
			}
			System.out.println();
		}
		System.out.println("-----------------------");			
	
	//5. number
		for(int i=5; i>=1; i--) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			for(int m=2; m<=i; m++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-----------------------");	
	}

}
