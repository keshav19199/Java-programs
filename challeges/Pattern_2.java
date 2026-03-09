package java_prog.challeges;

public class Pattern_2 {

	public static void main(String[] args) {

		for(int i=0; i<100; i++)
		{
			System.out.print("*");
			
			for(int j=0; j<i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
