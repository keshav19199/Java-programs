package java_prog.challeges;

public class Challenge_45_RevArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,7,8,9,9};
		int i=0;
		int swap=0;
		while(i<arr.length/2)
		{
			swap=arr[i];
			arr[i]=arr[(arr.length-1)-i];
			arr[(arr.length-1)-i]=swap;
			
			i++;
		}
		for(int j=0; j<arr.length; j++)
		{
			System.out.print(arr[j]+" ");
			
		}
	}

}
