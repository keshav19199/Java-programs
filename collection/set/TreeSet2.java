package java_prog.collection.set;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {

		Student s1=new Student(87,"john");
		Student s2=new Student(92,"Peter");
		Student s3=new Student(76,"golly");
		Student s4=new Student(75,"Jolly");
		
		TreeSet<Student> set=new TreeSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(set);
		
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("w");
		set1.add("t");
		set1.add("z");
		set1.add("b");
		System.out.println(set1);

		
		
		System.out.println(s1.compareTo(s2));
	}
}

class Student implements Comparable<Student>
{
	int marks;
	String name;
	
	public Student(int marks, String name)
	{
		this.marks=marks;
		this.name=name;
	}
	public String toString()
	{
		return this.name+" "+this.marks;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.marks, this.marks);
	}

}
