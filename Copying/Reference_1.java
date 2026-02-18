package java_prog.Copying;

public class Reference_1 {
	public static void main(String[] args) {
		
		Student stud=new Student();
		stud.id=123;
		stud.name="ranuuuuuu";
		
		System.out.println(stud.name);

		
		Student stud2=stud;
		
		stud.name="rahul";
		
		System.out.println(stud2.name);
		System.out.println(stud.name);
		
		System.out.println("*******************************");
		
		System.out.println(stud==stud2);
		System.out.println(stud.equals(stud2));
		
		// it's always true when you not write clone able and override it
		
	}
}
class Student
{
	int id;
	String name;

}
