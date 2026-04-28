package java_prog.challeges;

import java.util.Scanner;

public class CH_44_DeleteNoArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our Deletiong array");
		int[] arr=ArrayUtility.inputArray();
		System.out.println("which no is delete: ");
		int numDlt=sc.nextInt();
		
		int[] newArr=deletenum(arr,numDlt);
		System.out.println("Here is your new Array");
		ArrayUtility.displayArray(newArr);
		
		
		int Occurrences=noOfOccurreances(arr, numDlt);
		
	}
	
	public static int[] deletenum(int arr[], int numDlt)
	{
		int occ=noOfOccurreances(arr, numDlt);
		if(occ==0)
		{
			return arr;
		}
		int newSize=arr.length-occ;
		int[] newArr=new int[newSize];
		
		int i=0, j=0;
		
		while(i<arr.length)
		{
			if(arr[i] != numDlt)
			{
				newArr[j]=arr[i];
				j++;
			}
			i++;
		}
		
		return newArr;	
	}
	
	
	public static int noOfOccurreances(int[] numArr, int num)
	{
		int occ=0;
		int i=0;
		
		while(i<numArr.length)
		{
			if(numArr[i]==num)
			{
				occ++;
			}
			i++;
		}
		return occ;
	}
	

}
