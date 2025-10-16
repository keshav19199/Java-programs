package java_prog.Classes;

public class Class2 {

	public static void main(String[] args) {

		Second1 sahil=new Second1();
		
		System.out.println(sahil.age);
		System.out.println(sahil.name);
		
		System.out.println(new Second().hashCode());	//Advance part	=> different address because new object create
		System.out.println(new Second().hashCode());
		
		System.out.println(sahil.hashCode());		//Same hash address because one time object create.
		System.out.println(sahil.hashCode());
	}

}
class Second1
{
	int age=32;
	char name='S';
}
