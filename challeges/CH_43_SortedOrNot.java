package java_prog.challeges;

import java.util.Scanner;

public class CH_43_SortedOrNot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to array sorted checkpost");
		int [] arr=ArrayUtility.inputArray();
		
		boolean isInc=isIncreasing(arr);
		boolean isDec=isDescreasing(arr);
		
		if(isInc || isDec)
		{
			System.out.println("Your array is Sorted");
		}
		else
		{
			System.out.println("Array is not sort");
		}
		
	}
	public static boolean isIncreasing(int[] arr)
	{
		int i=1;
		while(i<arr.length)
		{
			if(arr[i]<arr[i-1])
			{
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static boolean isDescreasing(int[] arr)
	{
		int i=1;
		while(i<arr.length)
		{
			if(arr[i]>arr[i-1])
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
