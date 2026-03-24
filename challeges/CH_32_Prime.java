package java_prog.challeges;

import java.util.Scanner;

public class CH_32_Prime {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Wlcome our prime no calcy");
		System.out.print("Enter your no: ");
		int num=sc.nextInt();
		
		boolean isPrime=isPrime(num);
		if(isPrime)
		{
			System.out.println("Prime");
		}
		else {
			System.out.println("NOt Prime");
		}
		
	}
	public static boolean isPrime(int num)
	{
		int i=2;
		while(i<num)
		{
			if(num%i==0) {
			return false;
			}
			i++;
		}
		return true;
		
	}

}
