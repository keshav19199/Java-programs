package java_prog;

public class ForEachLoop2 {

	public static void main(String[] args) {

		for(int i=0; i<10; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int i[]= {10,11,23,11,33,43};
		for(int n:i)
		{
			System.out.print(n+" ");
		}
	}

}
