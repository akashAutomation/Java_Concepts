package BasicPrograms.basic;

public class PrintEvenOddFromArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int even_count =0;
		int odd_count = 0;
		
		System.out.println("---------even no--------");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
				even_count++;
			}
		}
		
		System.out.println("---------odd no--------");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
				odd_count++;
			}
		}
		
		System.out.println("even_count = "+even_count+", odd_count = "+odd_count);

	}

}
