package java_prog.exceptions.revision;

import java.util.ArrayList;

public class Error_HAndling {
	public static void main(String[] args) {

		ArrayList<Student1> list=new ArrayList<Student1>();
		
		try {
		for(int i=0; i<Integer.MAX_VALUE; i++)
		{
			Student1 s=new Student1(21,35.43," Keshav");
			s.age=i;
			s.marks=i;
			s.name=" "+i;
			
			System.out.println("Add Student: "+(i+1));
			
			list.add(s);
			
		}}
		catch(Error e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("The End..!");
		}
		System.out.println("Helloo..");
	}
}
class Student1
{
	int age;
	double marks;
	String name;
	
	public Student1(int age,double marks,String name)
	{
		this.age=age;
		this.marks=marks;
		this.name=name;
	}
}
