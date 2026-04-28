package java_prog.challeges;

public class CH_49_SumAvg2DArr {

	public static void main(String[] args) {

		System.out.println("Welcome to our 2D Array to Sum And Average");
		int [][] numArr=ArrayUtility.input2DArray();
		long sum=sum(numArr);
		double avg=avg(numArr);
		
		System.out.println("Your sum of array is "+sum);
		System.out.println("your average of array is "+avg);
		
		
	}
	public static long sum(int[][] numArr)
	{
		long sum=0;	
		int i=0;
		while(i<numArr.length)
		{
			int j=0;
			while(j<numArr[i].length)
			{
				sum=sum+numArr[i][j];
				j++;
			}
			i++;
		}
		return sum;
	}
	public static double avg(int[][] numArr)
	{
		if(numArr.length==0)
		{
			return 0;
		}
		int row=numArr.length;
		int clm=numArr[0].length;
		
		double size=row * clm;
		return sum(numArr)/size;
		
	}
	
	

}
