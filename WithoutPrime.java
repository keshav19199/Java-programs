//Print the numbers between 0 to 100 without print prime.
package java_prog;

public class WithoutPrime {

	public static void main(String[] args) {

		int counter=0;
		for(int i=2; i<100; i++)
		{
			boolean prime=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					prime=false;
					break;
				}
			}
			if(prime)
			{
				System.out.println(i);
				counter++;
			}
			
		}
		System.out.println("Total: "+counter);
	}
}