package BasicPrograms.basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {
    public static void main(String[] args) throws IOException {
        String s = "i am am abc abc xyz xyz";
        String[] arr = s.split(" ");

        //1
        String s1="";
        for(int i=0; i<arr.length; i++){
            boolean b= false;
            for(int j=0; j<i; j++){
                if(arr[i].equals(arr[j])){
                    b=true;
                    break;
                }
            }
            if(b==false){
                s1=s1+arr[i]+" ";
            }
        }
        System.out.println(s1.trim());

        //2
//        LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(arr));
//        for(String str: set){
//            System.out.print(str+" ");
//        }
    }
}
