package java_prog.challeges;

import java.util.Scanner;

public class CH_39_Pattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("We are here to print the Pattern..\n");
		System.out.print("Enter your number: ");
		int row=sc.nextInt();
		
		System.out.println("______________________________________________________");
		System.out.println();
		
		patternLeft(row);
		
		
		System.out.println("______________________________________________________");
		System.out.println();
		patternUp(row);
		
		
		System.out.println("______________________________________________________");
		System.out.println();
		patternR(row);
		
	}
	
	public static void patternUp(int maxRow)
	{
		int row=maxRow;
		while(row>0)
		{
			int i=0;
			while(i<row)
			{
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row--;
		}
	}

		public static void patternLeft(int maxRow) {
		int row=0;
		while(row<maxRow)
		{
			System.out.print("*");
			int i=0;
			while(i<row)
			{
				System.out.print(" *");
				i++;
			}
			System.out.println();
			row++;
		}
	}
		public static void patternR(int maxRow)
		{
			int row=maxRow;
			while(row>0)
			{
				int j=0;
				while(j<row-1)
				{
					System.out.print("  ");
					j++;
				}
				
				int i=0;
				while(i<= (maxRow-row))
				{
					System.out.print("* ");
					i++;
				}
				System.out.println();
				row--;
			}
	}
}
