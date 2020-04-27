package part1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		//Method 1:
		int a[] = { 1, 2, 3, 2,3,4 };
		Set<Integer> set = new TreeSet<Integer>();

		for (int i : a) {
			if (set.add(i)) { }
			else {
				System.out.println("Duplicate element found: " + i);
			     }
		}
		
		//Method 2:
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
		for(int j:a)
		{
			if(map.containsKey(j))
			{
				map.put(j,map.get(j)+1);
			}
			else
			{
				map.put(j,1);
			}
		}
		
		System.out.println(map);
		
		Set<Integer> s=map.keySet();
		
		for(Integer x:s)
		{
			if(map.get(x)>1)
			{
				System.out.println("Dupliacate elemet found: "+x+" Number of time occured is: "+map.get(x));
				
			}
		}

	}

}
