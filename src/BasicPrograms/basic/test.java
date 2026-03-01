package BasicPrograms.basic;

import java.lang.reflect.Array;
import java.util.*;

public class test {

    public static void main(String[] args)
    {
//        String arr[]= {"a:80", "b:85", "c:90", "a:90", "c:85"};
//        Map<String, List<Integer>> map = new HashMap<>();
//
//        for(int i=0; i<arr.length; i++){
//            String[] a2 = arr[i].split(":");
//            String key = a2[0];
//            Integer value = Integer.parseInt(a2[1]);
//            map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
//
//        }
//        for(Map.Entry<String, List<Integer>> entry: map.entrySet()){
//            List<Integer> li = entry.getValue();
//            int sum=0;
//            for(int v : li){
//                sum = sum+v;
//            }
//            double avg = (double) sum/li.size();
//            System.out.println(entry.getKey()+" -> "+avg);
//        }
        String s = "swiss"; //print 1st non repeatable char
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,0);
        }

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
        }

        System.out.println(map);
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+" -> "+entry.getValue());
                return;
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
