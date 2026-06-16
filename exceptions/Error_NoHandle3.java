package java_prog.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Error_NoHandle3 {

	public static void main(String[] args) {

		List<Car> c=new ArrayList<Car>();
		
		int id=1;
		String name="BMW";
		int count=0;
		
		try {
		while(true)
		{
			c.add(new Car(id,name));
			count++;
			//System.out.println(count);
		}
		}
		
		catch(OutOfMemoryError e)
		{
			System.out.println("Total Obj: "+count);
			System.out.println(c.add(new Car(id,name)));
		}
		finally {
			
			System.out.println("And soo.. Hello Java😂😂😂");
		}
		
	}

}
class Car{
	
	int price;
	String name;
	
	Car(int price, String name)
	{
		this.name=name;
		this.price=price;
	}
}


