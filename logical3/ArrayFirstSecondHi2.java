package java_prog.logical3;

public class ArrayFirstSecondHi2 {

	public static void main(String[] args) {

		int arr[]= {21,12,23,45,65,433,432,76,43,99};
		
		int num=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>num)
			{
				num=arr[i];
			}
			if(arr[i]>second && arr[i]<num)
			{
				second=arr[i];
			}
			if(arr[i]>third && arr[i]<second)
			{
				third=arr[i];
			}
		}
		System.out.println("First: "+num);
		System.out.println("second: "+second);
		System.out.println("third: "+third);
	}

}
