package JavaTraining.src.BasicPrograms.basic;

import java.util.HashMap;
import java.util.Map;

public class CountCharOuccurance {

	public static void main(String[] args) {
		String s = "abaccbaba";
        s=s.toLowerCase();
        s=s.replaceAll("\\s","");
		int beforeLen = s.length();

        //1
		String s1 = s.replace("a", "");
		int afterLen = s1.length();
		System.out.println("occurance of a = "+(beforeLen-afterLen));
		
       //2
        Map<Object, Object> m = new HashMap<Object, Object>();
        for(int i=0; i<s.length(); i++){
            int temp=0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    temp++;
                }

            }
            m.put(s.charAt(i), temp);
        }
        System.out.println(m);
        System.out.println(m.get('a'));
	}

}
