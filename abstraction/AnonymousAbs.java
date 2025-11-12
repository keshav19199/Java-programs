package java_prog.abstraction;

public class AnonymousAbs {

	public static void main(String[] args) {

	Study s=new Study()
	{
		public void doStudy(String str)
		{
			System.out.println("I am just Studing.."+str);
		}
	};
//	s.doStudy("1234");
//	s.doRest();
	
	Study s1=new Java();
	s1.doStudy("4321");
	
	s1.doRest();
	
	}

}
abstract class Study
{
	int i=231;
	
	abstract void doStudy(String str);
	
	public void doRest()
	{
		System.out.println("Rest..");
	}

}
class Java extends  Study
{
	public void doStudy(String str)
	{
		System.out.println("I am studing.."+str);
	}
	
	public void doRest()
	
	{
		System.out.println("Full Rest..");
		
	}
}
