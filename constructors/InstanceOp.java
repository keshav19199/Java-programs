package java_prog.constructors;

public class InstanceOp {

	public static void main(String[] args) {

		Animal animal=new Animal();		//object created method
		boolean result=animal instanceof Animal;
		System.out.println(result);
		
	}

}
class Animal
{
	final static int age=21;
	
	public Animal()
	{
		System.out.println("Object created...");
	}
}