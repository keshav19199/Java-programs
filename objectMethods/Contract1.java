package java_prog.objectMethods;

public class Contract1 {

	public static void main(String[] args) {

		Animal an=new Animal();
		Animal an1=new Animal();
		
		an.id=32;
		an1.id=43;
		
		an.name="abc";
		an1.name="abc";
		
		
		System.out.println(an.hashcode());
		System.out.println(an1.hashcode());
		
	}

}
class Animal
{
	int id;
	String name;
	
	public int hashcode()
	{
		//return 32;
		return this.id + this.hashCode();
	}

}
