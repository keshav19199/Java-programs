//Print the array with +1

package java_prog.array;

public class Array2 {
	public static void main(String[] args) {
		
		int[] arr=new int[10];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=i+1;
			
			System.out.println(arr[i]);			
		}
		
	}
}
