//Print the first 100 prime no of sum.

package java_prog.Logical2;

public class Prime2 {

	public static void main(String[] args) {

		int count=0;
		int sum=0;
		
		for(int i=2; i<=1000; i++)
		{
			boolean isPrime=true;
			for(int j=2; i>j; j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(i);
				sum = sum+i;
				count++;
				if(count==100)
				{
					break;
				}
			}
			
		}
		System.out.println("Total: "+count);
		System.out.println("Sum: "+sum);
	}

}
