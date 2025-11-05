package java_prog.polymorphism;

public class Dynamic_M_Dispatch {

	public static void main(String[] args) {

	
		Human human=new Man();	//reference is Human but object create Man.
		human.show();
		
		Human h=new Manav();
		h.show();
		
		Human h1=new Manus();
		h1.show();
	}

}
class Human
{
	String name="Human";
	
	public void show()
	{
		System.out.println("Human class method..");
	}
}
class Man extends Human
{
	public void show()
	{
		
		System.out.println("Man class method..");
	}
}
class Manav extends Man
{
	public void show()
	{
		System.out.println("Manav class method..");
	}
}

class Manus extends Human
{
	public void show()
	{
		System.out.println("Manus class method..");
	}
}

