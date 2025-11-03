package java_prog.polymorphism;

public class First {

	public static void main(String[] args) {

		Airoplane plane=new Airoplane();
		plane.plane(823,24);
		plane.plane(32.3);
		//System.out.println(4);
		//System.out.println(plane.plane(32));
	}

}
class Airoplane
{
	public void plane(int i)
	{
		System.out.println(32);
	}
	public void plane(String st, int j)
	{
		System.out.println("A");
	}
	public void plane(int j, String st)
	{
		System.out.println("B"+"=>int, string");
	}
	public void plane(int j, int k)
	{
		System.out.println("C =>int,int");
	}
	public void plane(String a)
	{
		System.out.println("D =>string");
	}
	public void plane(double dt)
	{
		System.out.println("32.2=> Double");
	}
}
