package java_prog.logical3;

public class ArrayFirstSecondHi {
	public static void main(String[] args) {
		
		int arr[]= {12,32,4,1009,999,56,76,98,192,65,43,79};
		
		int num=Integer.MIN_VALUE;
		
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>num)
			{
				second=num;
				num=arr[i];
			}
			
			if(arr[i]>second && num>arr[i])
			{
				third=second;
				second=arr[i];
			}
			if(arr[i]>third && second>arr[i])
			{
				third=arr[i];
			}
		}
		System.out.println("First Higest: "+num);
		System.out.println("Second Higest: "+second);
		System.out.println("Third higest: "+third);

		
	}

}
