package java_prog.challeges;

import java.util.Scanner;

public class CH_22_ORopra {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome OR operation ");
		
		System.out.print("enter first no: ");
		int first=sc.nextInt();
		
		System.out.print("enter second no: ");
		int second=sc.nextInt();
		
		int result= first | second;
		
		System.out.println("Result: "+result);
	}

}
