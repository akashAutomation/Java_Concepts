package BasicPrograms.Pattern;

public class Pattern3 {

	public static void main(String[] args) {
	//1. *
		for(int i=0; i<5; i++) {
			for(int k=1; k<5-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		
		
	//2. number
			int temp=1;
			for(int i=0; i<4; i++) {
				for(int k=1; k<4-i; k++) {
					System.out.print(" ");
				}
				for(int j=0; j<=i; j++) {
					System.out.print((temp++));
				}
				System.out.println();
			}
			System.out.println("-----------------------");	
	
		//3. number
			for(int i=1; i<=5; i++) {
				for(int k=1; k<=5-i; k++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print((i));
				}
				System.out.println();
			}
			System.out.println("-----------------------");	
			
		//4. number
			for(int i=1; i<=5; i++) {
				for(int k=1; k<=5-i; k++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print((j));
				}
				System.out.println();
			}
			System.out.println("-----------------------");	
			
		//5. number
			for(int i=1; i<=5; i++) {
				for(int k=1; k<=5-i; k++) {
					System.out.print(" ");
				}
				for(int j=i; j>=1; j--) {
					System.out.print((j));
					
				}
				System.out.println();
			}	
	}

}
