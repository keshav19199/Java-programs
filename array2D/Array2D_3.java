//Print the 2 dimensional array.
package java_prog.array2D;

public class Array2D_3 {

	public static void main(String[] args) {
		
		int[][] arr=new int [4][5];
		int counter=1;
		
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
