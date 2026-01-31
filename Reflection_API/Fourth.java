package java_prog.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Fourth {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class<?> cl=Class.forName("java_prog.Reflection_API.Mobile");
		
		
		Constructor<?>[] con=cl.getDeclaredConstructors();
		Field[] fil=cl.getDeclaredFields();
		
		Constructor<?> con2=cl.getDeclaredConstructor(double.class);
		System.out.println(con2);
		
		
		
		con2.setAccessible(true);

		Mobile m=(Mobile)con2.newInstance(324);
		
				
		Field fil2=cl.getDeclaredField("id");
		fil2.setAccessible(true);
		fil2.set(m, 34.432);
		System.out.println(fil2.get(m));
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Mobile
{
	private double id;
	
	private Mobile(double id)
	{
		this.id=id;
	}

}
