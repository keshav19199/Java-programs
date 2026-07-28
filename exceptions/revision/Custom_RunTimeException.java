package java_prog.exceptions.revision;

public class Custom_RunTimeException {
	public static void main(String args[]) {
		
		int marks=29;
		
		try {
		if(marks<50)
		{
			throw new AbsentException("Please increase the marks..");
		}
		}
		catch(AbsentException ae)
		{
			System.out.println(ae.getMessage());
		}
		
	}
}
class AbsentException extends RuntimeException
{
	public AbsentException(String s)
	{
		super(s);
	}
}
