package java_prog.challeges;

import java.util.Scanner;

public class CH_28_Table {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome Our Multiplication Table");
		System.out.print("Eneter Your No: ");
		
		int num=sc.nextInt();
		
		System.out.println();
		TableS(num);
	
		
	}

	public static void TableS(int num)
	{
		
		for(int i=1; i<=10; i++)
		{
			
			System.out.print(" "+num*i);
		}
		
	}
}
