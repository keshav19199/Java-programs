package java_prog.projects;

import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		double Balance=0;
		int choice;
		boolean isRunning=true;
		
		while(isRunning == true) 
		{
		
		System.out.println("***************************");
		System.out.println("BANK DETAILS");
		System.out.println("***************************");
		System.out.println("1.Show Balance");
		System.out.println("2.Deposite");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("***************************");
		
		System.out.print("Enter your choice(1-4): ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1 -> showBalance(Balance);
		case 2 -> System.out.println("Deposite");
		case 3 -> System.out.println("Withdraw");
		case 4 -> isRunning = false;
		
		default -> System.out.println("Invalid Choice..");
		}
		}
		sc.close();
	}

	static void showBalance(double Balance)
	{
		System.out.println("$"+Balance);
	}
}
