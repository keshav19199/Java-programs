package java_prog.challeges;

import java.util.Scanner;

public class CH_59_PasswordChecker {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to set your Password");
		String password;
		
		do {
			System.out.print("Enter password valid password: ");
			password=sc.next();
			
		}while(!isValidPass(password));
		System.out.println("Thanks for entering valid password");
		
	}
	public static boolean isValidPass(String pass)
	{
		return pass.length()>6;
	}

}
