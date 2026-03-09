package java_prog.challeges;

import java.util.Scanner;

public class CH_24_LeftShift {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcone our Left Shift operator");
		
		System.out.print("enter  no: ");
		int num=sc.nextInt();
		
		int result= num << 4;
		
		// <<4 = ans*ans*ans*ans(4times)
		// <<1 = ans*ans (2 times).
		
		System.out.println("result: "+result);
	}

}
