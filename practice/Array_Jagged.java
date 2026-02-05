package java_prog.practice;

public class Array_Jagged {

	public static void main(String[] args) {

		int count=0;
		int arr[][]=new int[6][];
		
		arr[0]=new int[12];
		arr[1]=new int[0];
		arr[2]=new int [1];
		arr[3]=new int[3];
		arr[4]=new int[2];
		arr[5]=new int[9];
		
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
