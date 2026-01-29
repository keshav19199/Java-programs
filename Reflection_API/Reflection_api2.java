package java_prog.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection_api2 {
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		// System.out.println(Employee.class);
		
		Class<?> cl=Class.forName("java_prog.Reflection_API.Employee");
		
		System.out.println(cl);
		
		Constructor<?>[] cons= cl.getDeclaredConstructors();

		for(Constructor c:cons)
		{
			System.out.println(c);
		}
		
		System.out.println("***********************************");
		Constructor<?> cons2= cl.getDeclaredConstructor(String.class);
		System.out.println(cons2);
		
		cons2.setAccessible(true);
		
		Employee ep=(Employee) cons2.newInstance("keshavwadhane1199@gmail.com");
		System.out.println(ep.email);
		
		
		
	}
}

class Employee
{
	String email;
	
	private Employee(String email)
	{
		this.email=email;
	}
	
	private Employee()
	{
		
	}
	
	public Employee(int id)
	{
		
	}
	

}