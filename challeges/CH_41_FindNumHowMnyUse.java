package java_prog.challeges;

import java.util.Scanner;

public class CH_41_FindNumHowMnyUse {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our number occurances\n");
		int numArry[]=ArrayUtility.inputArray();
		
		System.out.print("Enter the num you want to find:");
		int num=sc.nextInt();
		
		int Occurrance=noOfOccurrance(numArry, num);
		
		System.out.println("Your num is found "+Occurrance+" times in array	");
		
		
		
	}
	public static int noOfOccurrance(int[] numArray, int num)
	{
		int occ=0;
		int i=0;
		
		while(i<numArray.length)
		{
			if(numArray[i] ==num)
			{
				occ++;
			}
			
			i++;
		}
		return occ;
	}

}
