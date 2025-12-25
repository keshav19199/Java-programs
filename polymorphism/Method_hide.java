package java_prog.polymorphism;

public class Method_hide {

	public static void main(String[] args) {

		Room r=new Room();
		r.Light();
	
		Room r1=new Kitchen();
		r1.Light();
	}

}
class Room
{
	static void Light()
	{
		System.out.println("Light is on");
	}
}
class Kitchen extends Room
{
	
//	static void Light()
//	{
//		
//	}
}
