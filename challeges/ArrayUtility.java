package java_prog.challeges;

import java.util.Scanner;

public class ArrayUtility {
	public static int[] inputArray() {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the numbers of elements: ");
	int size=sc.nextInt();
	int [] num=new int[size];
	
	int i=0;
	while(i<size)
	{
		System.out.print("Enter elements no "+(i+1)+": ");
		num[i]=sc.nextInt();
		i++;
	}
	return num;
	}
	
	
	public static void displayArray(int[] numArray)
	{
		int i=0;
		while(i<numArray.length)
		{
			System.out.println(numArray[i]+" ");
			i++;
		}
		System.out.println();
	}

}
