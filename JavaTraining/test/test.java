package JavaTraining.test;

import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {

        int num1=5; //5+4+3+2+1
        int num= num1;
        int sum=0;
        while(num>0){
            sum=sum+num;
            num--;
        }
        System.out.println("sum = "+sum);

        int n=1;
        for(int i=5; i>=1; i--){

            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i);
                n++;
            }
            for(int k=2; k<=i; k++){
                System.out.print(i);
                n++;
            }
            System.out.println();
        }


    }

    public static int test1(int i){
       if(i>1){
           return (i*test1(i-1));
       }
       return 1;
    }


}
