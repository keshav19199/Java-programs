package java_prog.logical3;

public class ArraySort {

	public static void main(String[] args) {

		int[] arr= {12,19,15,-32,14,18,123,13,17};
		int temp=0;
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}

}
