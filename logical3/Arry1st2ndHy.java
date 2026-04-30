package java_prog.logical3;

public class Arry1st2ndHy {

	public static void main(String[] args) {

		int []arr={12,456,13,36,143,49,69,99};
		int high=0;
		int second=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>high)
			{
				second=high;
				high=arr[i];
			}
			if(arr[i]>second && arr[i]<high)
			{
				second=arr[i];
			}
		}
		System.out.println(high);
		System.out.println(second);
	}

}
