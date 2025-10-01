package java_prog.Classes;

public class Student {

	public static void main(String[] args) {

		Student1 stud=new Student1();
		stud.Name= "karan";
		stud.Rollno=4332;
		stud.subject();
		
		Student1 stud1=new Student1();
		stud1.Name="Bhau";
		stud1.Rollno=5331;
		stud1.subject();
		
		
	}

}

class Student1
{
	String Name;
	int Rollno;
	
	public void subject()
	{
		String sub="comp.sci";
		System.out.println("Subject of the student: "+sub);
		System.out.println("Name of the Student: "+Name);
		System.out.println("Roll No of the Student: "+Rollno);
		System.out.println();
	}
}
