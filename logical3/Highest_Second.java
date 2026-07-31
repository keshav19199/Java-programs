package java_prog.logical3;

public class Highest_Second {

	public static void main(String[] args) {

		int[] arr= {1,83,6,3,5,9,-313,3,2,7};
		
		int num=0;
		int second=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>num)
			{
				second=num;
				num=arr[i];
			}
			
			if(arr[i]>second && arr[i]<num)
			{
				second=arr[i];
			}
		}
		System.out.println("Higest: "+num);
		System.out.println("Secong High:"+second);
	}

}
