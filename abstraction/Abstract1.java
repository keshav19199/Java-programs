package java_prog.abstraction;

public class Abstract1 {

	public static void main(String[] args) {

		Bike H=new Hero();
		Bike Y=new Yammah();
		
		H.run();
		H.colour("Black");
		
		Y.run();
		H.colour("Red");
		
		
	}

}
abstract class Bike
{
	abstract void run();
	
	public Bike()
	{
		System.out.println("Im a two wheeler..");
	}
	
	
	abstract void colour(String str);
	
	
}
class Hero extends Bike
{
	void run()
	{
		System.out.println("bike run fast..");
	}
	
	public void colour(String str)
	{
		System.out.println("honda Colour : "+str);
	}
}

class Yammah extends Bike
{
	public void run()
	{
		System.out.println("very fast..");
	}
	
	public void colour(String str)
	{
		System.out.println("Yammah colour"+str);
	}
	
}
