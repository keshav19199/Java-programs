package java_prog.array;

public class HighLow {

	public static void main(String[] args) {

		int arr[]= {23,32,45,66,45,21,75,78,-888,7,-54,-34};
	
		int num1=Integer.MIN_VALUE;
		int num2=Integer.MAX_VALUE;
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>num1)
			{
				num1=arr[i];
			}
		}
		System.out.println("Higest: "+num1);
		
		for(int j=0; j<arr.length; j++)
			if(arr[j]<num2)
			{
				num2=arr[j];
			}
		System.out.println("Lowest: "+num2);
	}
	
}
