package java_prog.Anonymous_Class;

public class Anonymous_Class {

	public static void main(String[] args) {

		Demo d=new Demo()
				{
			public void fly()
			{
				System.out.println("hello");
			}
				};
		// Anonymous class mhnje ji method abstract ahe ti obj madhe implement keli
				//tr to zala anonymous class
				
				d.Take();
				d.fly();
			
	}
}
abstract class Demo
{
	public void Take()
	{
		System.out.println("take a way..");
	}
	
	public abstract void fly();
	
}
