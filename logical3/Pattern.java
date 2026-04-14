package java_prog.logical3;

public class Pattern {

	public static void main(String[] args) {

		int n=5;
		int i=0;
		
		while(i<5)
		{
			int j=0;
			while(j<i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
