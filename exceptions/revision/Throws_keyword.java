package java_prog.exceptions.revision;

public class Throws_keyword {

	public static void main(String[] args){

		Calculator cal=new Calculator();
		
		try {
		cal.add(11, 13);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class Calculator
{
	public void add(int a, int b) throws DemoException, Exception
	{
		if(a<0 || b<0)
		{
			throw new Exception("Less than zero value..");
		}
		else if( a>100 || b>100)
		{
			throw new DemoException("greater value exception..");
		}
		else
		{
			System.out.println(a+b);
		}
	}
}
class DemoException extends Exception
{
	public DemoException(String s)
	{
		super(s);
	}
}