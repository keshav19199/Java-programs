package java_prog.Reflection_API;

import java.lang.reflect.Constructor;

public class Second_2 {

	public static void main(String[] args) throws Exception {

		Class<?> cl= Class.forName("java_prog.Reflection_API.Car");
		
		Constructor<?>[] con=cl.getDeclaredConstructors();
		
		Constructor<?> con2=cl.getDeclaredConstructor(String.class);
		
		System.out.println(con2);
		
		con2.setAccessible(true);
		Car c=(Car)con2.newInstance("mercedes");
		
		System.out.println(c.name);
				
		
	}
}

class Car
{
	String name;
	private Car(String name)
	{
		this.name=name;
	}
}