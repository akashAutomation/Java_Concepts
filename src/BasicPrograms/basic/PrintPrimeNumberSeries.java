package BasicPrograms.basic;

public class PrintPrimeNumberSeries {

	public static void main(String[] args) {
		int num = 100;
		int totalNumbers=0;
		
		for(int j=1; j<num; j++) {
			int count = 0;
			if(j>1) {
				for(int i=1; i<=j; i++) {
					if(j%i==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.print(j+" ");
					totalNumbers++;
				}
			}

		}
		System.out.println();
		System.out.println("total prime Numbers = "+totalNumbers);
		

	}

}
