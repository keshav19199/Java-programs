package java_prog.Logoical;

public class Prime2 {

	public static void main(String[] args) {

		int count=0;
		for(int i=2; i<1000; i++)
		{
			boolean isp=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					isp=false;
					break;
				}
			
			}
			if(isp)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total: "+count);
	}

}
