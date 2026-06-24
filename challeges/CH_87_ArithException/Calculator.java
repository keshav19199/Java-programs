package java_prog.challeges.CH_87_ArithException;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Calculator..");
		System.out.print("Enter First no. :");
		int num1=sc.nextInt();
		System.out.print("Enter Second no. :");
		int num2=sc.nextInt();
		
		try {
			int result=num1/num2;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException ae)
		{
			if(ae.getMessage().equals("/ by zero"))
			{
				System.out.println("Divide by Zero Occurred");
			}
			else
			{
				throw ae;
			}
		}
	}

}
