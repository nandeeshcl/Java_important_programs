package part2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int a[]= {2,1,3,4,2,5,6,4};
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		for(int i:a)
		{
			set.add(i);
		}
		
		System.out.println(set);
	}

}
