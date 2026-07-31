package java_prog.Logoical;

public class Higest_Lowest {

	public static void main(String[] args) {

		int[] arr= {12,131,129,88,-143,-57,98,23,45,67,3,12,5,8,-36,75};
		
		int high=0;
		int high2=0;
		int low=1000;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>high)
			{
				high=high2;
				high=arr[i];
			}
			if(arr[i]<high && arr[i]>high2)
			{
				high2=arr[i];
			}
			if(arr[i]<low)
			{
				low=arr[i];
			}
		}
		System.out.println("Highest: "+high);
		System.out.println("Second High: "+high2);
		System.out.println("Lowest: "+low);
	}

}
