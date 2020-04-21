package part2;

import java.util.StringTokenizer;

public class NumbersOfWordsInString {

	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("Welcome to wipro");
		
		int count=0;
		
		while(st.hasMoreTokens())
		{
			count=count+1;
			System.out.println(st.nextToken());
		}
		
		System.out.println("Total number of tokens are: "+count);
				
				

	}

}
