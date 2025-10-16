package java_prog.Classes;

public class Class5 {

	public static void main(String[] args) {

		School little_star=new School();
		little_star.name="aabb";
		little_star.pincode="213456";
		
		little_star.add();				// add method.
		
		School poddar=new School();
		poddar.name="assd";
		poddar.pincode="435634";
		
		poddar.add();
		
	}

}
class School
{
	String name;
	String pincode;
	
	public void add()
	{
		for(int i=0; i<=100; i++)
		{
			System.out.println(i);
		}
		System.out.println("This is the add method of the class");
	}
}
