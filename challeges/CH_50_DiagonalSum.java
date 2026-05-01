package java_prog.challeges;

public class CH_50_DiagonalSum {

	public static void main(String[] args) {

		System.out.println("Welcome to sum of diagonal Array");
		int[][] numArr=ArrayUtility.input2DArray();
		long sum=sumOfDiagonal(numArr);
		System.out.println("Diagonal sum is: "+sum);
		
	}
	
	public static long sumOfDiagonal(int[][] numArr)
	{
		long leftSum=sumOfLeftDiag(numArr);
		long rightSum=sumOfRightDiag(numArr);
		
		long sum=leftSum+rightSum;
		if(numArr.length %2 !=0)
		{
			int ind=numArr.length/2;
			sum=sum-numArr[ind][ind];
			
		}
		return sum;
	}
	public static long sumOfLeftDiag(int[][] numArr)
	{
		int sum=0;
		int i=0;
		
		while(i<numArr.length)
		{
			sum=sum+numArr[i][i];
			i++;
		}
		return sum;
	}
	
	public static long sumOfRightDiag(int[][] numArr)
	{
		int sum=0;
		int i=0;
		
		while(i<numArr.length)
		{
			int col=numArr.length-i-1;
			sum=sum+numArr[i][col];
			i++;
		}
		return sum;
	}
}
