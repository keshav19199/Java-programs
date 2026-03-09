package java_prog.challeges;

import java.util.Scanner;

public class CH_23_XORop {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome in XOR Operator");
		System.out.print("enter first no: ");
		int first=sc.nextInt();
		
		System.out.print("enter second no: ");
		int second=sc.nextInt();
		
		// xor stands for: ^
		int result=first ^ second;
		
		System.out.println("Result: "+result);
	}

}
