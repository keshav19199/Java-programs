package java_prog.Reflection_API;

import java.lang.reflect.Constructor;

public class First {

	public static void main(String[] args) throws ClassNotFoundException {

		// System.out.println(Animal.class);
		
		Class<?> cl=Class.forName("java_prog.Reflection_API.Animal");
		
		Constructor<?>[] cs=cl.getConstructors();
		
			
		for(Constructor <?> c:cs)
		{
			System.out.println(c);
			System.out.println(c.getParameterCount());
			System.out.println(c.getName());
			System.out.println(c.getParameterTypes());
		}
	
		
	}
}

class Animal
{
	String name;
	int id;
	
	private Animal(String name, int id)
	{
		this.name=name;
		this.id=id;
		
		System.out.println("it is private constructor");
	}
	public Animal(int i)
	{
		
	}
	private Animal()
	{
		
	}

}
