package java_prog.challeges;

import java.util.Scanner;

public class CH_27_OddEvenBit {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome our Even odd operation");
		System.out.print("Enter your no: ");
		int num=sc.nextInt();
		
		if((num & 1)==1)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Even");
		}
		
	}

}
