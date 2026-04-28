package java_prog.challeges;

public class Challeng_44DltNo {

	public static void main(String[] args) {

		int[] arr= {12,23,45,66,23,44,34,55,12};
		int dlt=23;
		
		for(int i=0; i<arr.length; i++)
		{
			if(dlt==arr[i])
			{
				continue;
			}
			System.out.print(arr[i]+" ");
		}
	}

}
