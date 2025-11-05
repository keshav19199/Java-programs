package java_prog.polymorphism;

public class Overriding {

	public static void main(String[] args) {

	Planet planet=new Planet();
		Bl2 bl=new Bl2();
		bl.show();
		bl.seat();
	}

}
class Planet
{
	public void show()
	{
		System.out.println("This is show of the planet..");
	}
	public void seat()
	{
		System.out.println("this is the seat of the planet..");
	}
	public Planet()
	{
		super();
		System.out.println("The constructor of the planet..");
	}
}
class Blue extends Planet
{
	
	public void show()
	{
		System.out.println("This is show of the Blue..");
	}
	public void seat()
	{
		System.out.println("this is the seat of the Blue..");
	}
	
	
	public Blue()
	{
		super();
		System.out.println("The constructor of the blue class..");
	}
}
class Bl2 extends Blue
{

	public void show()
	{
		System.out.println("This is show of the Bl2..");
	}
	public void seat()		//This triangle symbol is overriding.
	{
		System.out.println("this is the seat of the Bl2..");
	}
	public Bl2()
	{
		super();
		System.out.println("The constructor of the Bl2 class..");
	}
}
