package java_prog.logical3;

public class Prime2 {

	public static void main(String[] args) {

		int total=0;
		int num=2;
		while(num<=100)
		{
			boolean flag=true;
			int i=2;
			while(i<num)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
				i++;
			}
			if(flag)
			{
				System.out.println(num);
				total++;
			
			}
			num++;
		}
		System.out.println("Total: "+total);
		
	}

}
