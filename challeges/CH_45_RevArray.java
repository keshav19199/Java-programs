package java_prog.challeges;

import java.util.Scanner;

public class CH_45_RevArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to Array Reversal.\n");
		int arr[]=ArrayUtility.inputArray();
		rev(arr);
		
		System.out.println("Reverce array is: ");
		ArrayUtility.displayArray(arr);
		
		
	}
	public static void rev(int arr[])
	{
		int i=0;
		while(i<arr.length/2)
		{
			int swap=arr[i];
			arr[i]=arr[(arr.length-1)-i];
			arr[(arr.length-1)-i]=swap;
			
			i++;
		}
	}

}
