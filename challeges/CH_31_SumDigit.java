package java_prog.challeges;

import java.util.Scanner;

public class CH_31_SumDigit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Wlcome to sum of digits");
		System.out.print("Enter no: ");
		int num=sc.nextInt();
		
		int sum=SumDigit(num);
		System.out.println("Sum of Digit: "+sum);
		
	}
	public static int SumDigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
	return sum;	
	}

}
