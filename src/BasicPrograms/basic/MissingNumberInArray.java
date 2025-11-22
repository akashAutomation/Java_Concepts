package BasicPrograms.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumberInArray {

	public static void main(String[] args) {
		/*
		 * rule : 1. Array should not have duplicate 
		 *        2. No need to be sorted order
		 *        3. values should be in range
		 */
		
		int a[] = {1,2,4,5,7,9,10};

        //1. using array
        Arrays.sort(a);
        int max=a[a.length-1];
        int min = a[0];

        for(int i=min; i<=max; i++){
            boolean b = false;
            for(int j=0; j<a.length; j++){
                if(i==a[j]){
                    b=true;
                    break;
                }
            }
            if(b==false){
                System.out.println("missing = "+i);
            }

        }

        //2. using set
//        Set<Integer> set = new HashSet<>();
//        for (int num : a) {
//            set.add(num);
//        }
//
//        int min = Arrays.stream(a).min().getAsInt();
//        int max = Arrays.stream(a).max().getAsInt();
//
//        System.out.print("Missing numbers: ");
//        for (int i = min; i <= max; i++) {
//            if (!set.contains(i)) {
//                System.out.print(i + " ");
//            }
//        }


    }

}
