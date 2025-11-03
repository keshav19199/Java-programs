package java_prog.polymorphism;

public class Second {
	public static void main(String[] args)
	{
		Bike ride=new Bike();
		ride.Honda(0);
		ride.Honda("t");
	}
}
class Bike
{
	public void Honda(int i)
	{
		System.out.println("Iteger");
	}
	public void Honda(String yz)
	{
		System.out.println("it is a String");
	}
}