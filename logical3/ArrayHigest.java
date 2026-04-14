package java_prog.logical3;

public class ArrayHigest {
	public static void main(String[] args) {
		
		int arr[]= {123,32,54,654,34,6576,32};
		
		int num=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>num)
			{
				
				num=arr[i];
			}
		}
		System.out.println("Higest is: "+num);
	}

}
