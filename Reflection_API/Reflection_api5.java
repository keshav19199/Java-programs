package java_prog.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflection_api5 {

	public static void main(String[] args) throws ClassNotFoundException, 
	NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException,NoSuchFieldException {

		
		Class<?> cl=Class.forName("java_prog.Reflection_API.Room");
		
		Constructor<?>[] con=cl.getDeclaredConstructors();
		Field[] fil=cl.getDeclaredFields();
		
		Constructor<?> con2=cl.getDeclaredConstructor(int.class,String.class);
		
		con2.setAccessible(true);
		Room room=(Room)con2.newInstance(43,"kk");
		//Room room2=(Room)con2.newInstance("kk");
		
		System.out.println(con2);
		
		Field fil2=cl.getDeclaredField("id");
		fil2.setAccessible(true);
		fil2.set(room,76);
		
		
		Field fil3=cl.getDeclaredField("name");
		fil3.setAccessible(true);
		fil3.set(room, "kkeshav");
		
		System.out.println(fil2.get(room));
		System.out.println(fil3.get(room));
		
		
	}

}
class Room
{
	private int id;
	String name;
	private Room(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

}