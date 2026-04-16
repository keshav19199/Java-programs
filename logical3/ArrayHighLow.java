package java_prog.logical3;

public class ArrayHighLow {

	public static void main(String[] args) {

		int arr[]= {12,32,43,54,65,67,988,-87,86,99,34,-6};
		
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;

		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min2=min;
				min=arr[i];
			}
			if(arr[i]>min && arr[i]<min2)
			{
				min2=arr[i];
			}
			
		}
		System.out.println("Lowest: "+min);
		System.out.println("2nd Low: "+min2);
		
		System.out.println("_________________________________________________");
				
		
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]>max)
			{
				max2=max;
				max=arr[j];
			}
			if(arr[j]<max && arr[j]>max2)
			{
				max2=arr[j];
			}
		}
		System.out.println("Higest: "+max);
		System.out.println("2nd High: "+max2);
	}
}
