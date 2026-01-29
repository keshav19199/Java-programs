package java_prog.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflection_api3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		//System.out.println(Bike.class);
		
		Class<?> cl= Class.forName("java_prog.Reflection_API.Bike");

		Field[] field=cl.getDeclaredFields();
		
		Constructor<?> con= cl.getDeclaredConstructor(double.class);
		
		con.setAccessible(true);
		
		Bike bk=(Bike)con.newInstance(8659.9654);
		
		for(Field f:field)
		{
			System.out.println(f);
		}
		
		Field fd=cl.getDeclaredField("price");
		System.out.println("---------------------------");
		System.out.println(fd);
		
		fd.setAccessible(true);
	//	fd.setDouble(bk, 0);
		System.out.println(fd.getDouble(bk));
		
	
	}
}

class Bike
{
	private double price;
	public String name;
	public String color;
	
	private Bike(double price)
	{
		System.out.println("Object created...");
	}
}
