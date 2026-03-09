package java_prog.challeges;

import java.util.Scanner;

public class CH_25_RightS {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcone our Right shift operator");
		
		System.out.print("enter  no: ");
		int num=sc.nextInt();
		
		int result= num >> 2;

		// >> 1 = asn/2.
		System.out.println("result: "+result);
	}

}
