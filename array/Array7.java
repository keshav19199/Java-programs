//Print the value with Highest,2Higest,3Highest and 4Higest. 

package java_prog.array;

public class Array7 {
	public static void main(String[] args) {
		
		int[] arr= { 12,32,45,35,63,67,98,15,74,93,49,53,26,73,85};
		
		int num=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		int fourth=Integer.MIN_VALUE;
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>num)
			{
				second=num;
				num=arr[i];
			}
			if(arr[i]>second && arr[i]<num)
			{
				third=second;
				second=arr[i];
			}
			if(arr[i]>third && arr[i]<second)
			{
				fourth=third;
				third=arr[i];
			}
			if(arr[i]>fourth && arr[i]<third)
			{
				fourth=arr[i];
			}			
		}
		System.out.println("Higest Element: "+num);
		System.out.println("Second Element: "+second);
		System.out.println("Third Element: "+third);
		System.out.println("Fourth Elenemt: "+fourth);
		
	}
	
}

