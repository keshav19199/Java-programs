//count how many numbers are even

package java_prog.array;

public class Practice1 {

	public static void main(String[] args) {

		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int counter=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				counter++;
			}
		}
		System.out.println("Even numbers: "+counter);
	}

}
