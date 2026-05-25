package java_prog.challeges;

import java.util.Scanner;

public class CH_65_ExiteOnExite {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our same statement");
		
		while(true)
		{
			System.out.print("Enter your command: ");
			String command=sc.next();
			
			if(command.equalsIgnoreCase("exit"))
			{
				break;
			}
		}
		System.out.println("Successfully Exited..");
	}

}
