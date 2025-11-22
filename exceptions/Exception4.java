package java_prog.exceptions;

public class Exception4 {

	public static void main(String[] args) {

		int age=41;
		
		try 
		{
			if(age>40 && age <60)
			{
				throw new NumberException();
			}
			else if(age>60 && age<80)
			{
				throw new Number2Exception();
			}
			else
			{
				System.out.println("You are young..");
			}
			
			
		}
			catch(NumberException Ne)
			{
				System.out.println(Ne.getMessage());
			}
			catch(Number2Exception Ne)
			{
				System.out.println(Ne.getMessage());
			}
		}
	}


class NumberException extends Exception
{
	public NumberException()
	{
		super("This is number 1 exception..");
	}
}

class Number2Exception extends Exception
{
	public Number2Exception()
	{
		super("2 Number Exception");
	}
}


