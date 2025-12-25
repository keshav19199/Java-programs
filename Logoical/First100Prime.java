package java_prog.Logoical;

public class First100Prime {

	public static void main(String[] args) {

		int counter=0;
		int sum = 0;
		
		
		for(int i=2; i<1000; i++)
		{
			boolean p=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					p=false;
				}
			}
			if(p)
			{
				System.out.println(i);
				sum=sum+i;
				
				counter++;
			}
			if(counter==100)
			{
				break;
			}
		}
		System.out.println("Total :"+counter);
		System.out.println("Total sum: "+sum);
	}

}
