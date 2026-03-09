package java_prog.challeges;

import java.util.Scanner;

public class CH_21_ANDop {
	
		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("show the Bitwise AND op..");
			System.out.print("Enter First No: ");
			int first=sc.nextInt();
			
			System.out.print("Enter Second No: ");
			int second=sc.nextInt();
			
			int result=first & second;
			
			// it give you binary and table addition. 
			
			System.out.println("Result : "+result);
			
			
		}

	}
