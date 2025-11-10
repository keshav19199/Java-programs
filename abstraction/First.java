package java_prog.abstraction;

public class First {

	public static void main(String[] args) {

		Animal a=new Tiger();
		a.run();
		a.eat();
	
		Tiger t=new Tiger();
		
	}

}
abstract class Animal
{
	abstract void eat();
	
	
	public void run()
	{
		System.out.println("Animals Runs fast..");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Tiger eats carnivers..😊");
	}
	
	public void run()
	{
		System.out.println("run fast..😀😁😂🤣😃😄😅😆");
		
	}
	void  jump()
	{
		System.out.println("Jumping..");
	}

}