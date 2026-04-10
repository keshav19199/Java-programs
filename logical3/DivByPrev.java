package java_prog.logical3;

public class DivByPrev {

	public static void main(String[] args) {

		int arr[]= {2,4,3,6,9};
		int count=0;
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]%arr[i-1]==0)
			{
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("Total: "+count);
	}

}
