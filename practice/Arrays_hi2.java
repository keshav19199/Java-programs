package java_prog.practice;

import java.util.Arrays;

public class Arrays_hi2 {

	public static void main(String[] args) {

		int arr[]= {32,100,54,6,85,75,4,6,43,23,56,3,57,65,89};
		
		Arrays.sort(arr);
		
		int m=arr.length;
		
		System.out.println(arr[m-1]);
		System.out.println(arr[m-2]);
		System.out.println(arr[m-3]);
	}

}
