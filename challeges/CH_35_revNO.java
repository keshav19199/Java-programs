package java_prog.challeges;

import java.util.Scanner;

public class CH_35_revNO {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our Reverse digit");
		System.out.print("Enter no: ");
		int num=sc.nextInt();
		
		int reverse=rev(num);
		System.out.println("Reverse : "+reverse);
	}
	public static int rev(int num)
	{
		int no=0;
		while(num>0)
		{
			int digit=num%10;
			no=no*10+digit;
			num=num/10;
		}
		return no;
	}

}
