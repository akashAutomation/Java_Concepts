package BasicPrograms.basic;

import java.util.HashMap;
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

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c)+1);
            }

        }
        System.out.println(map1);
    }
}
