package java_prog.stream_Operations;

import java.util.List;
import java.util.function.Predicate;

public class List4 {

	public static void main(String[] args) {

		Student s1=new Student(1,"yuvraj");
		Student s2=new Student(2,"Keshav wadhavane");
		Student s3=new Student(3,"karan");
		Student s4=new Student(4,"sai");
		
		List<Student> list=List.of(s1,s2,s3,s4);	// print list
		
		Predicate<Student> pre=(hi)->{return hi.name.length()>10;}; // logic
		
		list.stream().filter(pre)
		.forEach((hi)->{
			System.out.println(hi.id);
			System.out.println(hi.name);
			System.out.println("**********");
		});
		
	}
}
class Student
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}
