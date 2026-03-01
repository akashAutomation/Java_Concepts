package BasicPrograms.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AvgOfStringArrayData {
    public static void main(String[] args)
    {
        String[] arr = {"a:80", "b:85", "c:90", "a:90", "c:85"};
        Map<String, List<Integer>> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            String[] a2 = arr[i].split(":");
            String key = a2[0];
            Integer value = Integer.parseInt(a2[1]);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
        }
        for(Map.Entry<String, List<Integer>> entry: map.entrySet()){
            List<Integer> li = entry.getValue();
            int sum=0;
            for(int v : li){
                sum = sum+v;
            }
            double avg = (double) sum/li.size();
            System.out.println(entry.getKey()+" -> "+avg);
        }


    }
}
