package java_prog.challeges;

public class CH_70_toString {

	public static void main(String[] args) {

		Student st=new Student("keshav",22,206494);
		
		System.out.println(st.toString());
		
	}
}
class Student
{
	String name;
	int age;
	int roll;
	
	public Student(String name, int age, int roll)
	{
		this.name=name;
		this.age=age;
		this.roll=roll;
	}
	
	public String toString()
	{
		return "Student Details; {name: "+name+", roll: "+roll+", age:"+age+"}";
	}
}
