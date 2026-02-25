package java_prog.constructors;

public class This_3 {

	public static void main(String[] args) {

		Student stud=new Student();
	}
}

class Student
{
	public Student(String s)
	{
		this();
		System.out.println("D");
	}
	public Student()
	{
		this(1);
		System.out.println("A");
	}
	public Student(int i)
	{
		this(4,"hell");
		System.out.println("B");
	}
	 public Student(int i, String str)
	 {
		 System.out.println("C");
	 }
}