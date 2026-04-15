package java_prog.challeges;

import java.util.Scanner;

public class CH_40_ArraySumAvg {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our Sum average calculator");
		
		int[] numArray=ArrayUtility.inputArray();
		
		long sum=sum(numArray);
		double avg=avg(numArray);
		
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+avg);
		
	}
	
	public static long sum(int[] numArray)
	{
		long sum=0;
		int i=0;
		while(i<numArray.length)
		{
			sum=sum+numArray[i];
			i++;
		}
		return sum;
	}
	
	public static double avg(int[] numArray)
	{
		double sum=sum(numArray);
		
		return (sum/numArray.length);
	}
	
	

}
