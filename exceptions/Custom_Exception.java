package java_prog.exceptions;

public class Custom_Exception {

	public static void main(String[] args) {

		int i=343;
		
		try {
			if(i>10 && i<20)
			{
				throw new Ten_Exception();
			}
			else if(i>20 && i<30)
			{
				throw new Twenty_Exception();
			}
			else if(i>30 && i<40)
			{
				throw new Thirty_Exception();
			}
			else
			{
				System.out.println("Hiii.."+i);
			}
		}
		catch(Ten_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Twenty_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Thirty_Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("---The End---");
		}
	}

}
class Ten_Exception extends Exception
{
	public Ten_Exception()
	{
		System.out.println("20 exception..");
	}

}
class Twenty_Exception extends Exception
{
	public Twenty_Exception()
	{
		System.out.println("30 exception..");
	}

}
class Thirty_Exception extends Exception
{
	public Thirty_Exception()
	{
		System.out.println("40 exception..");
	}
	

}
