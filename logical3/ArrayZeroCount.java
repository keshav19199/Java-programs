package java_prog.logical3;

public class ArrayZeroCount {

	public static void main(String[] args) {

		int []arr= {4,0,5,6,0,9,0,0,6};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
			{
				System.out.print(arr[i]+" ");
				
			}
			
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
				
			}
			
		}
		System.out.println("_________________________________");
		for(int a:arr) {
			System.out.print(a + " ");
		}
	}

}
