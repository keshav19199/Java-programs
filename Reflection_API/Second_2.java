package java_prog.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;



public class Second_2 {

	public static void main(String[] args) throws Exception {

		Class<?> cl= Class.forName("java_prog.Reflection_API.Car");
		
		Constructor<?>[] con=cl.getDeclaredConstructors();
		Field[] fil=cl.getDeclaredFields();
		
		Constructor<?> con2=cl.getDeclaredConstructor(String.class);
		
		System.out.println(con2);
		
		con2.setAccessible(true);
		Car c=(Car)con2.newInstance("mercedes");
		
		System.out.println(c.name);
		
		System.out.println("___________________________________________");
		
		
		
		
		
		
		
		Field f=cl.getDeclaredField("id");
		f.setAccessible(true);
		f.setDouble(c, 23432.435);
		
		System.out.println(f.get(c));
		
				
		
	}
}

class Car
{
	private double id;
	String name;
	private Car(String name)
	{
		this.name=name;
	}
}