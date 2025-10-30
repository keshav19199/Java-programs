package java_prog.inheritance;

public class Multi_Level {

	public static void main(String[] args) {

		Animal1 animal=new Animal1();
		animal.run();
		
		Tiger1 tiger=new Tiger1();
		tiger.hunt();
		
		Shera Rubi=new Shera();
		Rubi.run();
		System.out.println(Rubi.colour);
		
	}
}
class Animal1
{
	public void run()
	{
		System.out.println("I am running..");
	}

}
class Tiger1 extends Animal1
{
	public void hunt()
	{
		System.out.println("I am hunting..");
	}
}
class Shera extends Tiger1
{
	String colour="Black Yellow";
}
