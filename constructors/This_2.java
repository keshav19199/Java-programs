package java_prog.constructors;

public class This_2 {
	public static void main(String[] args)
	{
		
		Animal1 animal=new Animal1();
	}

}
class Animal1
{
	public Animal1()
	{
		this(3);
		System.out.println("A");
	}
	public Animal1(int a)
	{
		System.out.println("B");
	}
}