//Prime number between 0 to 100.
package java_prog;

public class PrimeNo {

	public static void main(String[] args) {

		int counter=0;
		for(int i=2; i<=100; i++)
		{
			boolean isPrime=true;
			for(int j=2; j<i; j++)
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
				counter++;
			}
		}
		System.out.println("Total Prime No.: "+counter);
	}

}
