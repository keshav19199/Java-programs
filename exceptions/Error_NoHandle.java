package java_prog.exceptions;

public class Error_NoHandle {

	public static void main(String[] args) {

		Student1 st=new Student1();

		System.out.println(st.id);
		
		
	}

}


class Student1
{
	int id;
	String name;
	
	public void Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

}
