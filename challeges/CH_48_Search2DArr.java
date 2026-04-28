package java_prog.challeges;

import java.util.Scanner;

public class CH_48_Search2DArr {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to 2D search");
		int[][]numArr=ArrayUtility.input2DArray();
		
		System.out.println("Now enter the number you want to search");
		int num=sc.nextInt();
		
		boolean isFound=search(numArr,num);
		if(isFound)
		{
			System.out.println("num is found");
		}
		else
		{
			System.out.println("not found");
		}
	}
	public static boolean search(int[][] numArr, int num)
	{
		int i=0;
		while(i<numArr.length)
		{
			int j=0;
			while(j<numArr.length)
			{
				if(numArr[i][j] == num)
				{
					return true;
				}
				j++;
			}
			i++;
		}
		
		return false;
	}

}
