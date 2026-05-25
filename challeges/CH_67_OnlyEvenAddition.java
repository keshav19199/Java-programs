package java_prog.challeges;

import java.util.Scanner;

public class CH_67_OnlyEvenAddition {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to oue Even No Addition Calculator");
		int[] numArr=ArrayUtility.inputArray();
		
		int sum=0;
		for(int num:numArr)
		{
			if(num%2!=0)
			{
				continue;
			}
			sum=sum+num;
		}
		System.out.println(sum);
	}

}
