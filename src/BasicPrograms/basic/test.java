package BasicPrograms.basic;

import java.util.*;

public class test {

    public static void main(String[] args)
    {
        //2,3,5,7

        int arr[] = {5,2,10,7,9};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));


    }

    public static int rec(int n){
        int fact=1;
        if(n>0){
            fact=n*rec(n-1);
        }
    return fact;
    }
}
