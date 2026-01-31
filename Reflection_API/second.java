package java_prog.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class second {
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		//System.out.println(School.class);
		
		Class<?> cl=Class.forName("java_prog.Reflection_API.School");
		
		Constructor<?>[] co=cl.getDeclaredConstructors();
		
		for(Constructor c:co)
		{
			System.out.println(c);
		}
		
		System.out.println("*************************");
		
		
		Constructor<?> co2=cl.getDeclaredConstructor(String.class);
		System.out.println(co2);
		
		co2.setAccessible(true);
		
		School sc=(School)co2.newInstance("9834903632");
		
		System.out.println(sc.mobile);
		
		
	}

}
class School
{
	String mobile;
	
	private School(String mobile)
	{
		this.mobile=mobile;
		System.out.println("OBJECT create....");
	}
	private School(int i)
	{
		
	}
	
}