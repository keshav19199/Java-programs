package java_prog.challeges;

import java.util.Scanner;

public class CH_42_MinMaxArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to my min max array");

		int numArr[]=ArrayUtility.inputArray();
		
		int min=min(numArr);
		int max=max(numArr);
		
		System.out.println("Min array is "+min);
		System.out.println("max array is "+max);
		
			
	}

	public static int min(int[] numArr)
	{
		int min=Integer.MAX_VALUE;
		int i=0;
		while(i<numArr.length)
		{
			if(min>numArr[i])
			{
				min=numArr[i];
			}
			i++;
		}
		return min;
	}
	
	public static int max(int[] numArr)
	{
		if(numArr.length==0)
		{
			return Integer.MIN_VALUE;
		}
		int max=numArr[0];
		int i=1;
		while(i<numArr.length)
		{
			if(max<numArr[i])
			{
				max=numArr[i];
			}
			i++;
		}
		return max;
	}
}
