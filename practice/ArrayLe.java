package java_prog.practice;

public class ArrayLe {

	public static void main(String[] args) {

		int arr[]=new int [300];
		
		int count=0;
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=count;
			count++;
			System.out.println(count);

		}
		
	}

}
