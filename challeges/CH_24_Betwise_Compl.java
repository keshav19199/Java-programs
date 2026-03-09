package java_prog.challeges;

import java.util.Scanner;

public class CH_24_Betwise_Compl {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcone our betwise compliment operator");
		
		System.out.print("enter  no: ");
		int num=sc.nextInt();
		
		int result= ~num;
		
		System.out.println("result: "+result);
	}

}
