package java_prog.loops;

public class PrimeNo2 {

	public static void main(String[] args) {

		for(int i=2; i<200; i++)
		{
			boolean flag=true;
			
			for(int j=2; j<i; j++)
			{
				if(i%2==0)
				{
					flag=false;
				}
			}
			if(flag==true)
			{
				System.out.print(i+" ");
			}
		}
	}

}