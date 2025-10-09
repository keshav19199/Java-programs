//Print the value Highest, second, third and fourth of the series.
package java_prog.array;

import java.util.Arrays;
public class Array8Imp {

	public static void main(String[] args) {
		
		int arr[]= {14,52,45,60,80,75,89,12,48};
		
		Arrays.sort(arr);
		
		int n=arr.length;
		
		System.out.println("Higest: "+arr[n-1]);
		System.out.println("Second: "+arr[n-2]);
		System.out.println("Third: "+arr[n-3]);
		System.out.println("Fourth: "+arr[n-4]);

	}

}
