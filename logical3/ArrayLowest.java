package java_prog.logical3;

public class ArrayLowest {
	public static void main(String [] args) {
		
		int num=Integer.MAX_VALUE;
		
		int arr[]= {12,21,43,5,76,87,2323,43,-34,3};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<num)
			{
				num=arr[i];
			}
		}
		System.out.println("Lowest: "+num);
	}

}
