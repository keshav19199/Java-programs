//print the odd no in 0 to 100 and count it.
package java_prog;

public class OddNo {

	public static void main(String[] args) {

		int counter=0;
		
		for(int i=0; i<=100; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				counter++;
			}
		}
		System.out.println("Odd no.: "+counter);
	}

}
