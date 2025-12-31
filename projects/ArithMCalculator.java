package java_prog.projects;

import java.util.Scanner;

public class ArithMCalculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		double num1;
		double num2;
		double sum;
		double sub;
		double multi;
		double div;
		double mod;
		
		boolean isRunning=true;
		
		while(isRunning==true)
		{System.out.println();
		System.out.println("******************");
		System.out.print("Enter Num 1: ");
		num1=sc.nextDouble();
		System.out.print("Enter Num 2: ");
		num2=sc.nextDouble();
		System.out.println("******************");

		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulos");
		System.out.println("6. Exit");
		
		System.out.println("******************");
		System.out.print("Enter Your Choice: ");
		int choice=sc.nextInt();

		System.out.println("******************");
		System.out.println("    THANK YOU    ");
		System.out.println("******************");


		
		switch(choice)
		{
		case 1: sumation(sum=num1+num2);
		break;
		case 2: sub(sub=num1-num2);
		break;
		case 3: multi(num1*num2);
		break;
		case 4: div(num1/num2);
		break;
		case 5: mod(num1%num2);
		break;
		
		case 6: isRunning=false;
		break;
		default :
		System.out.println("Invalid choice..");
		
		}
		
		}
		
		sc.close();
		
			
	}
	public static void sumation(double sum)
	{
		System.out.println(sum);
	}
	public static void sub(double sub)
	{
		System.out.println(sub);
	}
	public static void multi(double multi)
	{
		System.out.println(multi);
	}
	public static void div(double div)
	{
		System.out.println(div);
	}	public static void mod(double mod)
	{
		System.out.println(mod);
	}

}
