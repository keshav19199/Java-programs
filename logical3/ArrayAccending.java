package java_prog.logical3;

public class ArrayAccending {

	public static void main(String[] args) {

		int[] arr={12,19,17,14,18,13,73};
		int ass=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					ass=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=ass;
				}
			}
		}
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
