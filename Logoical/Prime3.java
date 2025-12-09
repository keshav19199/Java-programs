package java_prog.Logoical;

public class Prime3 {

	public static void main(String[] args) {

		int num=97;
		
		boolean isPrime=true;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
		{
			System.out.println(num+" is prime.");
		}
		else
		{
			System.out.println(num+" not pirime");
		}
		
		
			
	}

}
