package java_prog.logical3;

public class Fibonacci {

	public static void main(String[] args) {

		int a=0,b=1,c;
		
		int i=0;
		while(i<10)
		{
			System.out.print(a+" ");
			
			c=a+b;
			a=b;
			b=c;
			
			i++;

		}
	}

}
