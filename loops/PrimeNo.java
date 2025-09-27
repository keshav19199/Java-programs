package java_prog.loops;

public class PrimeNo {

	public static void main(String[] args) {
		
				int num=11;
				
				boolean flag=true;
				for(int i=0; i<num; i++)
				{
					if(num%2==0)
					{
						flag=false;
					}
				}
				if(flag==false)
				{
					System.out.println("Not a prime Number...");
				}
				else
				{
					System.out.println("it is prime Number...");

				}
				
			}

		

	}


