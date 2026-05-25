package java_prog.challeges;

import java.util.Scanner;

public class CH_66_SkipEven {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Only Positive Number Adition.");
		int[] numArr=ArrayUtility.inputArray();
		
		int sum=0;
		for(int num: numArr)
		{
			if(num<0)
			{
				continue;
			}
			sum=sum+num;
			
		}
		System.out.println(sum);
		
	}

}
