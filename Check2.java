package java_prog;

public class Check2 {

	public static void main(String[] args) {

		byte a=10;
		byte b=20;
		
		Letter l=new Letter(a,b);
		Letter l2=new Letter(a,b);
		
		System.out.println(l.equals(l2));
		System.out.println(l.hashCode());
		System.out.println(l2.hashCode());
		
	}
}

 class Letter{
	Letter(int a,int b)
	{
		System.out.println("a="+a+"b="+b);
	}
	Letter(float a,float b)
	{
		System.out.println("a="+a+"b"+b);
	}
}