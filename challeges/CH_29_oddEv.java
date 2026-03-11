package java_prog.challeges;

import java.util.Scanner;

public class CH_29_oddEv {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome ODD EVEN Sum");
		System.out.print("Eneter No: ");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("ODD");
		}
		
		int sum=0;
		for(int i=0; i<=num; i++)
		{
			//System.out.println(i);
			sum+=i;
		}
		System.out.println("Sum is: "+sum);
		
		
		
	}

}
