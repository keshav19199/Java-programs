package java_prog.Reflection_API;

import java.lang.reflect.Field;

public class Reflection_api3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException{
		
		Class<?> cl=Class.forName("java_prog.Reflection_API.Bike");
		
		Field[] fil=cl.getDeclaredFields();
		
		for(Field f:fil)
		{
			System.out.println(f);
		}
		
		Field f=cl.getDeclaredField("price");
		

	}
}
class Bike
{
	private double price;
	
	private Bike(double price)
	{
		this.price=price;
	}

}