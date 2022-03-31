package BasicPrograms.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
	//1. *	
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	
	//2. number
		int temp=1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((temp++)+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");	

	//3. number
			for(int i=0; i<5; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print((j+1)+" ");
				}
				System.out.println();
			}

	}

}
