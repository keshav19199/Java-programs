//Find the highest and lowest element of the Array.

package java_prog.array;

public class Array6 {
	public static void main(String[] args) {
		
		int[] arr= {2,43,21,34,65,87,98,89,-87,-6,-8,45,43};
		int num=Integer.MIN_VALUE;
		int num2=Integer.MAX_VALUE;
				
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>num)
			{
				num=arr[i];
			}
		}
		System.out.println("Higest Element: "+num);
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<num2)
			{
				num2=arr[i];
			}
		}
		System.out.println("Lowest Element: "+num2);
	}

}
