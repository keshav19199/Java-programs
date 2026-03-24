package java_prog.challeges;

import java.util.Scanner;

public class CH_33 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our GCD calulator");
		System.out.print("Enter First no.: ");
		int first=sc.nextInt();
		System.out.print("Enter Second no: ");
		int second=sc.nextInt();
		
		int gcd=gcd(first, second);
		System.out.println("GCD is: "+gcd);
		
		
	}
	public static int gcd(int num1, int num2)
	{
		int gcd=1;
		
		int least=least(num1,num2);
		
		int i=1;
		while(i<=least) {
			
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
			i++;
		}
		return gcd;
		
	}
	public static int least(int num1, int num2)
	{
		if(num1<num2)
		{
			return num1;
		}
		else {
			return num2;
		}
	}

}
