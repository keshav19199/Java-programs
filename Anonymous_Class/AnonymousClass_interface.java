package java_prog.Anonymous_Class;

public class AnonymousClass_interface {

	public static void main(String[] args) {
		
		Demo1 d1=new Demo1()
		{
			public void fly()
			{
				System.out.println("This is inner class..");
			}
		};
		
		d1.Take();
		d1.fly();
		
	}
}
interface  Demo1
{
	default void Take()
	{
		System.out.println("Take a way");
	}
	public abstract void fly();
}
