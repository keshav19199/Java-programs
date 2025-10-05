package java_prog.Classes;

public class Final_Static2 {

	public static void main(String[] args) {

		Cow A=new Cow();
		A.name="Sarashii..";
		A.age=10;
		
		Cow B=new Cow();
		B.name="Bandii..";
		B.age=8;
		
		A.showdetails();
		B.showdetails();
	}

}
class Cow
{
	String name;
	int age;
	final String Type="It's a Cow..";
	
	public void showdetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println(Type);
		System.out.println();
	}

}
