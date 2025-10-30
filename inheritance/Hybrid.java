package java_prog.inheritance;

public class Hybrid {

	public static void main(String[] args) {

		//When more than one types of inheritance
		Safari safari=new Safari();
		System.out.println(safari.Wheeler);
	}

}
class Car
{
	String Wheeler="Four";
}
class Hyundai extends Car
{
	
}
class Tata extends Car
{
	
}
class Safari extends Tata
{
	
}