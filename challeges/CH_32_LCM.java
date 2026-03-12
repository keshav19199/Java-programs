package java_prog.challeges;

import java.util.Scanner;

public class CH_32_LCM {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome Calculate LCM");
		System.out.print("Enter First No: ");
		int first=sc.nextInt();
		System.out.print("Enter Second No: ");
		int second=sc.nextInt();
		
		int lcm=lcm(first,second);
		
		System.out.println("LCM is: "+lcm);
	}
	public static int lcm(int first, int second)
	{
		int i=1;
		while(true)
		{
			int fact=first*i;
			if(fact%second==0)
			{
				return fact;
			}
			i++;			
		}

	}

}
