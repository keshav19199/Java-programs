package java_prog.exceptions.revision;

public class HirarchyException {

	public static void main(String[] args) {

		Child2 c2=new Child2("Child 2 Exception");
		
		
		System.out.println(c2);
	}
}
class Parent
{
	String message;
	
	public Parent(String s)
	{
		this.message=s;
		System.out.println("Parent Method.."+s);
	}
}
class Child extends Parent
{
	String message; 
	
	public Child(String s)
	{
		super(s);
		System.out.println("Child "+s);
	}
}
class Child2 extends Child
{
	
	public Child2(String s)
	{
		super(s);
		System.out.println("Child2"+s);
	}

}
