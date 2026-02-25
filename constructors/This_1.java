package java_prog.constructors;

public class This_1 {

	public static void main(String[] args) {

		Demo d=new Demo();
	}

}
class Demo
{
	public Demo()
	{
		this(4);
		System.out.println("one");
	}
	public Demo(int i)
	{
		this(4,2);
		System.out.println("Two");
	}
	public Demo(int i, int j)
	{
		System.out.println("Three");
	}
}
