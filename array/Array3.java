// Print 1500 peoples who's 80% educated with array.

package java_prog.array;

public class Array3 {
	public static void main(String[] args) {
		
		int counter=0;
		int[] people=new int[1500];
		
		for(int i=0; i<1500; i++)
		{
			if(i%80==0)
			{
				counter++;
			}
			people[i]=i;
		}
		System.out.println("Counter: "+counter);
	}

}
