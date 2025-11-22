package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDulicates {

	public static void main(String[] args) {
		ArrayList<Integer> al =  new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,1,2,3,4));
		ArrayList<String> sal = new ArrayList<String>(Arrays.asList("a","b","a","b","c","A","c"));
		
		// 1. using LinkedHashSet
		HashSet<Integer> lhs = new HashSet<Integer>(al);
        System.out.println(lhs);
		
		ArrayList<Integer> withoutDuplicate = new ArrayList<Integer>(lhs);
		System.out.println(withoutDuplicate);
		
		// 2. JDk 8 - stream
		List<Integer> l = al.stream().distinct().collect(Collectors.toList());		
		System.out.println(l);
		
		List<String> sl = sal.stream().distinct().collect(Collectors.toList());
		System.out.println(sl);
	}

}
