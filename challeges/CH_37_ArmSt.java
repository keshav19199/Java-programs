package java_prog.challeges;

public class CH_37_ArmSt {

	public static void main(String[] args) {

		int count=0;
		
		
		for(int i=1; i<=1000; i++)
		{
			int sum=0;
			int num=i;
			while(num>0)
			{
				int digit=num%10;
				sum=sum+(digit*digit*digit);
				num=num/10;
			}
			if(sum==i)
			{
				count++;
				System.out.println(i);
			}
		}
		
	}

}
