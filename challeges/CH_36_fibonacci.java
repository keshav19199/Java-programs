package java_prog.challeges;

import java.util.Scanner;

public class CH_36_fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to fibbonacci series");
		System.out.print("enter how many range to printed: ");
		int num=sc.nextInt();
		
		Fibonacci(num);
		
		
	}
	public static void Fibonacci(int num)
	{
		if(num<0) return;
		System.out.print("0 ");
		if(num==0) return;
		System.out.print("1 ");
		
		int first=0, second=1;
		while(first+second<=num)
		{
			int third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
						
		}
	}
	
}
