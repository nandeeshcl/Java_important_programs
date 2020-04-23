package part2;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		//using set
		int a[]= {7,1,3,4,11,5,6,4};
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		for(int i:a)
		{
			set.add(i);
		}
		
		System.out.println(set);
		
		
		//using map
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int j=0;j<a.length;j++)
		{
			map.put(a[j],a[j]+1);
		}
		
		Set<Integer> set1=map.keySet();
		for(Integer s:set1)
		{
			System.out.print(s+" ");
		}
		
		
 	}

}
