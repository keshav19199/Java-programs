package java_prog.Revision;

import java.util.Scanner;

public class Fynction_2 {

	public static void main(String[] args) {

		greet();
		int first=ReadNo();
		int second=ReadNo();
		
		int result=first+second;
		
		System.out.println("sum :"+result);
		
	}
	public static int ReadNo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The No: ");
		int num=sc.nextInt();
		return num;
	}
	public static void greet()
	{
		System.out.println("Welcome To our calculator");
	}

}
