package BasicPrograms.basic;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingArray {

	public static void main(String[] args) {
	// 1. using Bubble sort	
		int arr[] = {5,2,10,7,9};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1]; 
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	//2. ascending using inbuilt method
//		int a[] = {5,2,10,7,9};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
	//3. descending using inbuilt method
//		Integer b[] = {5,2,10,7,9};
//		Arrays.sort(b, Collections.reverseOrder());
//		System.out.println(Arrays.toString(b));
		
	//4. ascending using inbuilt method
//		String s[] = {"b","a","d","e","c"};
//		Arrays.sort(s);
//		System.out.println(Arrays.toString(s));
		
	//5. descending	using inbuilt method
//		String s2[] = {"b","a","d","e","c"};
//		Arrays.sort(s2, Collections.reverseOrder());
//		System.out.println(Arrays.toString(s2));
		
	//6. 2nd largest and smallest number
		System.out.println("2nd largest = "+arr[arr.length-2]+", 2nd smallest = "+arr[1]);
	}

}
