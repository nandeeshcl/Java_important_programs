package part2;

public class EvenNumberFrom1to100 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<100;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("Sum of even number is: "+sum);

	}

}
