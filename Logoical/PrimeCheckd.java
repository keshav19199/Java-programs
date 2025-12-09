package java_prog.Logoical;

public class PrimeCheckd {

	public static void main(String[] args) {

		int num=59;
		boolean prime=true;
		
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime)
		{
			System.out.println(num+" : is a Prime Number.");
		}else
		{
			System.out.println(num+" is not a Prime Number.");
		}
	}

}
