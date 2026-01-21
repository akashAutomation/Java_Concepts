package BasicPrograms.basic;

import java.lang.reflect.Array;
import java.util.*;

public class test {

    public static void main(String[] args)
    {
        String a[]= {"ab", "ab", "abc", "abcd", "abc","ab"};

//        for(int i=0; i<a.length; i++){
//            for(int j=i; j<a.length; j++){
//                if(a[i].equals(a[j])){
//                    System.out.println(a[i]);
//                }
//            }
//        }
        Map<String, Integer> map = new HashMap<>();
        for(String s:a){
            map.put(s, 0);
        }

        for(String s : a){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
        }

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }

    public static int rec(int num){
        if(num>0){
            return num*rec(num-1);
        }
        return 1;
    }

}
