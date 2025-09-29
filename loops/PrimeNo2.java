package java_prog.loops;

public class PrimeNo2 {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=2; i<100; i++)
		{
			boolean flag=true;
			
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag==true)
			{
				System.out.print(i+" ");
				count++;
			}
		}System.out.println("\nTotal Prime Numbers are: "+count);
	}

}