package java_prog.challeges;

import java.util.Scanner;

public class CH_30_factorial {

		public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
				System.out.println("Welcome to Calculate factorial");
				System.out.print("Enter the no: ");
				int num=sc.nextInt();
				int fact=Factorial(num);
				
				System.out.println("Factorial is: "+fact);
				
				
			}
			public static int Factorial(int num)
			{
				if(num<2)
				{
					return 1;
				}
				
				long fact=1;
				for(int i=1; i<=num; i++)
				{
					fact=fact*i;
					
				}
				return (int) fact;
	}

}
