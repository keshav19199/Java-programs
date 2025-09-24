//print 2D array with reverse numbers with 9 to 1.
//9 8 7
//6 5 4
//3 2 1

package java_prog.array2D;

public class Array2D_2 {

	public static void main(String[] args) {
		
		int counter=9;
		int[][] arr=new int[3][3];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; i++)
			{
				arr[i][j]=counter;
				counter--;
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
