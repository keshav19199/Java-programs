//calculate which numbers are even i 0 to 100.
package java_prog.array;

public class Practice2 {

	public static void main(String[] args) {

		int counter=0;
		
		for(int i=0; i<=100; i++)
		{
			if(i%2==0)
			{
				counter++;
				System.out.println(i+" ");
			}
		}
		System.out.println("Even no.: "+counter);
	}

}
