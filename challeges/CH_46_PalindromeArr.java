package java_prog.challeges;

import java.util.Scanner;

public class CH_46_PalindromeArr {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Palindrome checker");
		int[] num=ArrayUtility.inputArray();
		boolean isPalin=isPalindrome(num);
		
		if(isPalin)
		{
			System.out.println("your array is palindron");
		}
		else
		{
			System.out.println("not palindrom");
		}
		
		
	}
	public static boolean isPalindrome(int[] num)
	{
		int i=0;
		while(i<num.length/2)
		{
			if(num[i] != num[num.length-1 -i])
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
