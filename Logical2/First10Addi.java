package java_prog.Logical2;

public class First10Addi {

	public static void main(String[] args) {

		int count=0;
		int sum=0;
		
		for(int i=2; i<=1000; i++)
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
				sum=sum+i;
				
				count++;
				
			}
			if(count==10)
			{
				break;	
			}
				
		}
		System.out.println("total: "+count);
		System.out.println("total addition: "+sum);
	}

}
