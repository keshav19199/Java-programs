package java_prog.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Reflection_api4 {

	public static void main(String[] args) throws Exception{

		System.out.println(Plane.class);
		Class<?> cl=Class.forName("java_prog.Reflection_API.Plane");
		
		Field[] field=cl.getDeclaredFields();
		
		Constructor<?> cons=cl.getDeclaredConstructor(double.class);
		cons.setAccessible(true);
		
		Plane pl=(Plane)cons.newInstance(4233.43);
		
		
		
		for(Field f:field)
		{
			System.out.println(f);
			System.out.println(f.getType());
		}
		
		Field sal=cl.getDeclaredField("salary");
		System.out.println("*************************");
		System.out.println(sal);

		sal.setAccessible(true);
		//sal.setDouble(pl, 0);
		System.out.println(sal.getDouble(pl));
	}

}
class Plane
{
	private double salary;
	 public String name;
	 public String email;
	 
	 private Plane(double salary)
	 
	 {
		 System.out.println("OBJECT create....");
		 this.salary=salary;
	 }
	 

}
