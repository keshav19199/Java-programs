package java_prog.exceptions;

public class Exception3 {

	public static void main(String[] args) {

		String Bike="motor";
		
		try {
			if(Bike=="Hero")
			{
				throw new BikeException();
			}
			System.out.println("It's a other Bike..");
		}
		catch(BikeException b)
		{
			System.out.println(b.getMessage());
		}
		finally
		{
			System.out.println("....Done....");
		}
		
	}

}
class BikeException extends Exception
{
	public BikeException()
	{
		super("fz");
	}

}