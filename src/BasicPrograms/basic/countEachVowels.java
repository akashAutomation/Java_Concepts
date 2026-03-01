package BasicPrograms.basic;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class countEachVowels {
    public static void main(String[] args)
    {
        String s = "ababasbcoiehseoiusb";
        s = s.toLowerCase();
        s = s.replaceAll("\\s","");
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        char[] arr = {'a','e','i', 'o', 'u'};
        for(char c: arr){
            map1.put(c, 0);
        }

        /*
            int[] arr1 = {1, 1, 2, 3, 4,3,2};

            Map<Integer, Integer> map = new HashMap<>();
            for(int i: arr1){
                map.put(i, 0);
            }
         */

//        for(int i=0; i<s.length(); i++){
//            char c = s.charAt(i);
//            if(map1.containsKey(c)){
//                map1.put(c, map1.get(c)+1);
//            }
//
//        }
        for(char c: s.toCharArray()){
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c)+1);
            }
        }

        int maxOuccurence = Collections.max(map1.values());
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            //System.out.println("key --> "+entry.getKey()+", value --> "+entry.getValue());

            if(entry.getValue().equals(maxOuccurence)){
                System.out.println("highest occuerence vowel is '"+entry.getKey()+"' which occuered "+entry.getValue()+" times.");
            }
        }

    }
}
