package java_prog.logical3;

public class ArmStrong {

	public static void main(String[] args) {

		for(int i=0; i<1000; i++)
		{
			int num=i;
			int sum=0;
			int digit=0;
			
			while(num>0)
			{
				digit=num%10;
				sum=sum+(digit*digit*digit);
				num=num/10;
			}
			if(sum==i)
			{
				
				System.out.println(i);
			}
		}
	}

}
