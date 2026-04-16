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
	
	public static void display(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			System.out.println(arr[i]+" ");
			i++;
		}
		System.out.println();
		
	}

}
