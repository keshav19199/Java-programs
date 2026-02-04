package java_prog.practice;

import java.util.Arrays;

public class Array_high {

	public static void main(String[] args) {

		int arr[]= {12,23,43,54,75,98,2348,17,29,7,47};
		
		Arrays.sort(arr);
		
		int n=arr.length;
		
		System.out.println(arr[n-1]);
		System.out.println(arr[n-2]);
		System.out.println(arr[n-3]);
		
	}

}
