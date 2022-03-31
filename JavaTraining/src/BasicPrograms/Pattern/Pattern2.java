package BasicPrograms.Pattern;

public class Pattern2 {

	public static void main(String[] args) {
		//1. *	
			for(int i=0; i<5; i++) {
				for(int j=5; j>i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("-----------------------");
		
		//2. number
			int sum=0;
			int num = 5;
			int num1 = num;
			while(num>0) {
				sum = sum+num;
				num--;
			}
			for(int i=0; i<num1; i++) {
				for(int j=num1; j>i; j--) {
					System.out.print((sum--)+" ");
				}
				System.out.println();
			}
			System.out.println("-----------------------");	

		//3. number				
				for(int i=0; i<5; i++) {
					int temp2=1;
					for(int j=5; j>i; j--) {
						System.out.print((temp2++)+" ");
					}
					System.out.println();
				}

		}			
	

}
