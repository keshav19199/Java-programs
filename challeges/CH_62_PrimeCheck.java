package java_prog.challeges;

import java.util.Scanner;

public class CH_62_PrimeCheck {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our prime Checker");
		System.out.print("Enter No: ");
		int num=sc.nextInt();
		
		System.out.println((isPrime(num)? "Prime":"Not PRime"));
	}
	public static boolean isPrime(int num)
	{
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
