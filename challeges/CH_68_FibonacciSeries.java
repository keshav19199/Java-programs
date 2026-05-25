package java_prog.challeges;

import java.util.Scanner;

public class CH_68_FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our Fibonacci Series");
		System.out.print("Enter How many No to be Printed: ");

		int count=sc.nextInt();
		for(int i=1; i<=count; i++)
		{
			System.out.print(fibonacci(i)+" ");
		}
	}
	public static int fibonacci(int position)
	{
		//System.out.print(".");
		if(position==1)
		{
			return 0;
		}
		if(position==2)
		{
			return 1;
		}
		return fibonacci(position-1) + fibonacci(position-2);
	}

}
