package java_prog.practice;

public class Array_3d {

	public static void main(String[] args) {

		int arr[][][]=new int [3][][];
		int count=0;
		
		arr[0]=new int[3][3];
		arr[1]=new int [3][4];
		arr[2]=new int [2][1];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					arr[i][j][k]=count;
					count++;
				}
			}
		}
		
		
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			//System.out.println("******");
		}
		
	}

}
