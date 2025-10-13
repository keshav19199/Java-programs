package java_prog.array2D;

public class JaggedArray3 {

	public static void main(String[] args) {

		int arr[][]=new int[4][];
		int counter=1;
		
		arr[0]=new int[3];
		arr[3]=new int[5];
		arr[2]=new int[6];
		arr[1]=new int[30];
		
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=counter;
				counter++;
				
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
