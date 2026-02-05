package java_prog.practice;

public class Array_2D {

	public static void main(String[] args) {

		int count=1;
		int arr[][]=new int [3][3];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=count;
				count++;
				
			}
		}
		

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
