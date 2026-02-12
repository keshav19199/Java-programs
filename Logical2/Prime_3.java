package java_prog.Logical2;

public class Prime_3 {

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
			if(flag)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total: "+count);
	}

}
