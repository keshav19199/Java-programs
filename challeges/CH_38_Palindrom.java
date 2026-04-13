package java_prog.challeges;

import java.util.Scanner;

public class CH_38_Palindrom {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome our Palindrom");
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		
		boolean isPalindrom=isPalindrom(num);		
		if(isPalindrom)
		{
			System.out.println("Palindrom..");
		}
		else
		{
			System.out.println("not Palindrom");
		}
	
		
	}
	public static boolean isPalindrom(int num)
	{
		return num==rev(num);
		
	}
	
	
	public static int rev(int num)
	{
		int newNum=0;
		while(num>0)
		{
			int digit=num%10;
			newNum=newNum*10+digit;
			num=num/10;
		}
		return newNum;
	}

}
