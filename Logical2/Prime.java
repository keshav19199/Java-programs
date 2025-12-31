//Print the prime number into 100

package java_prog.Logical2;

public class Prime {

	public static void main(String[] args) {

		int count1=0;
		int count2=0;
		
		
		for(int i=2; i<=100; i++)
		{
			boolean b=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					b=false;
					break;
				}
			}
			if(b)
			{
				System.out.println(i);
				count1++;
			}
			if(!b)
			{
				System.out.print("Non Prime: ");
				System.out.println(i);
				count2++;
			}
		}
		System.out.println("\n\nPrime: "+count1);
		System.out.println("non prime: "+count2);
	}

}
