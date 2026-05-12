package java_prog.logical3;

public class ArrayAssending2 {

	public static void main(String[] args) {

		int arr[]= {1,43,21,76,42,34,5,78,97,56};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int acc: arr)
		{
			System.out.print(acc+" ");
		}
	}

}
