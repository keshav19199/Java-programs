package java_prog.practice;

public class Prime_1 {
	public static void main(String args[]) {
		
		int count=0;
		int sum=0;
	
		for(int i=2; i<1000; i++)
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
			if(count==100)
			{
				break;
			}
		}
		System.out.println("Total: "+count);
		System.out.println("sum: "+sum);
	}

}
