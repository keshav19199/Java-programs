// double class create.
package java_prog.Classes;

public class Class4 {

	public static void main(String[] args) {

		Student4 rahul=new Student4();
		rahul.id=14;
		rahul.marks=87.78;
		
		System.out.println(rahul.id);
		System.out.println(rahul.marks);
		
		Bike GT650=new Bike();
		GT650.name="gt650";
		GT650.number=1919;
		
		System.out.println("Bike Name: "+GT650.name);
		System.out.println("Number: "+GT650.number);

	}

}
class Student4
{
	int id;
	double marks;
	
}
class Bike
{
	String name;
	int number;
}
