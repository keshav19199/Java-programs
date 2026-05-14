package java_prog.challeges;

import java.util.Scanner;

public class CH_64_occurences {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Occurencess");
		int[] num=ArrayUtility.inputArray();
		
		System.out.print("Enter number you want to search: ");
		int element=sc.nextInt();
		
		int occ=countOcc(num, element);
		System.out.println("Element was Found "+occ+" times");
	}
	public static int countOcc(int[] num, int element)
	{
		int occ=0;
		for(int n:num)
		{
			if(n == element)
			{
				occ++;
			}
		}
		return occ;
	}

}
