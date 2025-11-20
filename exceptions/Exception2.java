package java_prog.exceptions;

public class Exception2 {

	public static void main(String[] args) {

		int age=243;
		
		try
		{
			if(age<43)
			{
				throw new NoException();
			}
			System.out.println("Exception not generate.");
		}
		catch(NoException n)
		{
			System.out.println("Hiii..");
		}
		finally
		{
			
			System.out.println(">>>  End  <<<");
		}
		
	}

}
class NoException extends Exception
{
	

}
