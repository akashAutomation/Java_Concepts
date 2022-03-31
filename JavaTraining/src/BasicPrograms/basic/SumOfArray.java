package BasicPrograms.basic;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum = 0;
		
	//1.	
//		for(int i=0; i<a.length; i++) {
//			sum = sum+a[i];
//		}
//		System.out.println(sum);

	//2. enhanced for loop
		for(int value : a) {
			sum = sum+value;
		}
		System.out.println(sum);
	}

}
