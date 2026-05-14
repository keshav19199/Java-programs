package java_prog.challeges;

import java.util.Scanner;

public class CH_61_MultiTable {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ur Multiplication table");
		System.out.print("Enter your num: ");
		int num=sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}
	}

}
