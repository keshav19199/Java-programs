package java_prog.exceptions.revision;

public class Pipe_Operator {

	public static void main(String[] args) {

		double salary=120.32;
		
		try {
			if(salary<100)
			{
				throw new FirstException("salary is very less");
			}
			else if(salary >100 && salary <200)
			{
				throw new SecondException("oky but less salary");
			}
			System.out.println("salary is okay..");
		}
		catch(FirstException | SecondException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
}

class FirstException extends Exception
{
	public FirstException(String s)
	{
		super(s);
	}
}
class SecondException extends Exception
{
	public SecondException(String s)
	{
		super(s);
	}
}