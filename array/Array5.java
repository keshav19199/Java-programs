//Find the Highest Element

package java_prog.array;

public class Array5 {
	public static void main(String[] args) {
		
		int[] arr= {12,43,-2,23,54,34,65,36};
		int num=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>num)
			{
				num=arr[i];
			//	System.out.println(num); //   => Which value is assign
			}
		}
		System.out.println("Highest: "+num);
	}

}
