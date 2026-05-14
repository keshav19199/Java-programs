package java_prog.challeges;

import java.util.Scanner;

public class CH_63_ArrayMax {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to finding the maximum");
		int[] arr=ArrayUtility.inputArray();
		
		int max=Integer.MIN_VALUE;
		
		for(int num:arr)
		{
			if(max<num)
			{
				max=num;
			}
		}
		System.out.println("Maximum array is: "+max);
	}

}
