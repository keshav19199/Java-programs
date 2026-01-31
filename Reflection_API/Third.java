package java_prog.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Third {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class<?> cl =Class.forName("java_prog.Reflection_API.Collage");
		
		Field[] fil=cl.getDeclaredFields();
		
		for(Field f:fil)
		{
			System.out.println(f);
		}
		
		Constructor<?> con=cl.getDeclaredConstructor(String.class);
		
		con.setAccessible(true);

		Collage cg=(Collage)con.newInstance("");
		
		
		
		Field f1=cl.getDeclaredField("name");
		f1.setAccessible(true);
		
		System.out.println(f1.get(cg));
		
		
		
	}

}
class Collage{
	
	private String name="jhdshj";
	
	private Collage(String name)
	{
		this.name=name;
	}

}
