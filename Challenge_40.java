package java_prog;

public class Challenge_40 {

	public static void main(String[] args) {

		int count=0;
		int	 sum=0;
		
		for(int i=0; i<=10; i++)
		{
			sum+=i;
			count++;
		}
		System.out.println("Sum: "+sum);
		System.out.println("average: "+(double)sum/count);
		
	}

}
