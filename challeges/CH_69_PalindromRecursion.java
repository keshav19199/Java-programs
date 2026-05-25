package java_prog.challeges;

import java.util.Scanner;

public class CH_69_PalindromRecursion {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Palindrome Checker");
		System.out.print("Enter the String To Checking: ");
		String str=sc.next();
		
		System.out.println("Your String is "+ (isPalindrome(str)? 
												"Palindrome" : "Not Palindro"));
	}
	
	public static boolean isPalindrome(String str)
	{
		if(str.length()<=1)
		{
			return true;
		}
		int lastPos=str.length()-1;
		if(str.charAt(0)!=str.charAt(lastPos))
		{
			return false;
		}
		
		String newStr=str.substring(1,lastPos);
		return isPalindrome(newStr);
	}

}
