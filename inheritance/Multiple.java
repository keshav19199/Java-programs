package java_prog.inheritance;

public class Multiple {

	public static void main(String[] args) {

		PC pc=new PC();
		System.out.println(pc.name);
	}

}
class Laptop
{
	String name="HP..";
}
class desktop
{
	String name="HP..";
}
class PC extends Laptop,desktop
{
	
}
