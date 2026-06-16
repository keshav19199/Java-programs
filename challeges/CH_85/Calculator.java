package java_prog.challeges.CH_85;

public class Calculator {

	public static void main(String[] args) {

		Calculator c=new Calculator();
		
		System.out.println(	c.add(3, 4));
		System.out.println(c.add(3.3, 4.4));
		System.out.println(c.add(3, 4, 5));
		

	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int add(int a,int b, int c)
	{
		return a+b+c;
	}

	public double add(double a, double b)
	{
		return a+b;
	}
}
