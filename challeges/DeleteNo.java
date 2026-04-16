package java_prog.challeges;

public class DeleteNo {

	public static void main(String[] args) {

		int arr[]= {21,23,45,43,23,54,65,76};
		int num=21;
		
		for(int i=0; i<arr.length; i++)
		{
			if(num==arr[i])
			{
				continue;
			}
			System.out.print(arr[i]+" ");
		}
	}

}
