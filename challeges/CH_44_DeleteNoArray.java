package java_prog.challeges;

import java.util.Scanner;

public class CH_44_DeleteNoArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Array Deletion\n");
		int[] arr=ArrayUtility.inputArray();
		System.out.println("Enter the no which you want to delete");
		int numDlt=sc.nextInt();
		
		int[] arr2=delete(arr, numDlt);
		System.out.println("Here is your new Array");
		ArrayUtility.display(arr2);
		
		
	}
	public static int[] delete(int[] arr, int numDlt)
	{
		int occ=
	}

}
