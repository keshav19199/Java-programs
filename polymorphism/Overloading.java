package java_prog.polymorphism;

public class Overloading {

	public static void main(String[] args) {

		Car c=new Car();
		c.add(4, 5);
		c.sub("4","5", 0);
		//c.sub();
	}

}
class Car
{
	public void add(int a, int b)		//overloading is a determine by signature. 
	{										//it check to no.of param,sequence and type of parameter.
		System.out.println(a+b);
	}
	
	public void sub(String z, String y, int w)
	{
		System.out.println("string - string - int");
		//System.out.println("z" - "y" - w);
	}
}
