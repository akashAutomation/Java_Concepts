package BasicPrograms.basic;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		boolean c = Arrays.equals(a, b); // contain same elements in same order 
		if(c==true) {
			System.out.println("equal");
		}
		else {
			System.out.println("not");
		}

	}

}
