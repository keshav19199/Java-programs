package java_prog.constructors;

public class InputParameter {

	public static void main(String[] args) {

		Railway rail=new Railway();
		rail.add(10, 32);
		rail.sub(10.2, 2, 10.68);
	}

}
class Railway
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void sub(double d1, int d2, double d3)
	{
		System.out.println(d1-d2-d3);
	}
}
