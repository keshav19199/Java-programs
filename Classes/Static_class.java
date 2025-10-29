package java_prog.Classes;

public class Static_class {

	public static void main(String[] args) {

		Student2 boys=new Student2();
		
		boys.name="rahul";
		boys.marks=76.54;
		
		boys.pass();	// declare to local variable method.
		System.out.println();
		System.out.println(boys.name+"****"+boys.marks);
		
	}

}
class Student2
{
	String name;	//instance variable
	double marks;
	
	public void pass()
	{
		String avrage="43.687";	//local variable
		int pass=65;
		System.out.println(avrage);
		System.out.println(pass);
		
		
	}

}
