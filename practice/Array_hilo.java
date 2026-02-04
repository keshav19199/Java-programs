package java_prog.practice;

public class Array_hilo {

	public static void main(String[] args) {

		int arr[]= {12,4,2,46,78,76,2,56,788,34,24,57,8,-23,-45};
		
		int num1=Integer.MIN_VALUE;
		int num2=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>num1)
			{
				num1=arr[i];
			}
		}
		
		System.out.println("High"+num1);
	
		
		for(int j=0;  j<arr.length; j++)
		{
			if(arr[j]<num2)
			{
				num2=arr[j];
				
			}
		}
		System.out.println("LOW"+num2);
	}

}
