package JavaTraining.src.BasicPrograms.basic;

import java.util.Arrays;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		int a[] = {5,2,10,7,9};
		int max = a[0];
		int min = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}
			else if(min>a[i]) {
				min = a[i];
			}
			
		}
		
		System.out.println("max = "+max+", min = "+min);

        //2
//        Arrays.sort(a);
//        System.out.println("max1 = "+a[a.length-1]);
//        System.out.println("min1 = "+a[0]);
	}

}
