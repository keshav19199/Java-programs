package java_prog.array;

public class PrintArray {

	public static void main(String[] args) {

		int arr[]=new int[400];
		int counter=1;
		
		for(int i=0; i<arr.length; i++)	//print array
		{
			arr[i]=counter;
			counter++;
			System.out.println(arr[i]);

		}
		System.out.println();

	}

}
