package java_prog.projects;

import java.util.Scanner;

public class BankDetails {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		
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
		case 2 -> Balance = Balance + Deposite();
		case 3 -> Balance = Balance - Withdraw(Balance);
		case 4 -> isRunning = false;
		
		default -> System.out.println("Invalid Choice..");
		}
		}
		System.out.println("*****************************");
		System.out.println("Thank you! Have a nice day!...");
		System.out.println("*****************************");
		sc.close();
	}

	static void showBalance(double Balance)
	{
		System.out.println("$"+Balance);
		
	}
	static double Deposite()
	{
		double amount;
		System.out.println("Enter an amount to be deposited: ");
		amount = sc.nextDouble();	
		
		if(amount<0)
		{
			System.out.println("Amount can't be negative");
			return 0;
		}
		else {
			return amount;
		}
	}
	
	
	static double Withdraw(double Balance)
	{
		double amount;
		System.out.println("Enter amount to withdraw: ");
		amount = sc.nextDouble();
		
		if(amount > Balance)
		{
			System.out.println("Insufficient amount");
			return 0;
		}
		else if(amount < 0)
		{
			System.out.println("Amount can't be negative");
			return 0;
		}
		else {		
			return amount;
		}
		
	}
	
}
