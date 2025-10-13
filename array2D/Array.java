package java_prog.array2D;

public class Array {

	public static void main(String[] args) {

		int arr[]=new int[10];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=2*10;
		}
		System.out.println(arr[3]);

		int arr2[]=new int[6];
		System.out.println(arr2.length);	//calculate the array size
	}

}
