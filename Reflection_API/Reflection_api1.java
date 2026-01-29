package java_prog.Reflection_API;

import java.lang.reflect.Constructor;

public class Reflection_api1 {
	public static void main(String args[]) throws ClassNotFoundException{
		
		Class<?> cl=Class.forName("java.lang.String");
		
		Constructor<?>[] cons=cl.getDeclaredConstructors();
		
		System.out.println("Total Constructor: "+cons.length);
		
		for(Constructor c:cons)
		{
			System.out.println(c);
			System.out.println();
		}
	}

}
