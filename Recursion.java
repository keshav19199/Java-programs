package java_prog;

public class Recursion {

	public static void main(String[] args) {

		int result=fact(5);
		System.out.println(result);
		
	}
	public static int fact(int num)
	{
		int fact;
		if(num==1)
		{
			return 1;
		}
		return num*fact(num-1);
	}

}
