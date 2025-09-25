//Print the 3D Ayyay in single row.

package java_prog.array2D;

	public class Array3D {

		public static void main(String[] args) {
			
			int counter=1;
			int[][][]arr=new int[2][][];
			
			arr[0]=new int[3][2];
			arr[1]=new int[4][7];
			
			
			for(int x=0; x<arr.length; x++)
			{
				for(int y=0; y<arr[x].length; y++)
				{
					for(int z=0; z<arr[x][y].length; z++)
					{
						arr[x][y][z]=counter;
						counter++;
					}
				}
				
			}
			for(int x=0; x<arr.length; x++)
			{
				for(int y=0; y<arr[x].length; y++)
				{
					for(int z=0; z<arr[x][y].length; z++)
					{
						System.out.print(arr[x][y][z]+" ");
					}
					System.out.println();
				}
				System.out.println("******");	
			}

		}

	}
