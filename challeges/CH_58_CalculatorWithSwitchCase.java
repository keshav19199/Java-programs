package java_prog.challeges;

import java.util.Scanner;

public class CH_58_CalculatorWithSwitchCase {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Our Calculator");
		
		System.out.print("Enter Your First NO: ");
		int num1=sc.nextInt();
		System.out.print("Enter Your 2nd NO: ");
		int num2=sc.nextInt();
		
		System.out.print("Enter Your Operation: ");
		String operation=sc.next();
		
		int result=switch(operation) {
		
		case "+" ->num1+num2;
		case "-" ->num1-num2;
		case "*" ->num1*num2;
		case "/" ->num1/num2;
		case "%" ->num1%num2;
		
		default -> 0;
		
		};
		
		System.out.println("Your Answer is: "+result);
				
	}

}
