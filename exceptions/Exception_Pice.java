package java_prog.exceptions;

public class Exception_Pice {

	public static void main(String[] args) {

		int age=65;
		
		try 
		{
			if(age>40 && age<50)
			{
				throw new OneException();
			}
			else if(age>50 && age<70)
			{
				throw new TwoException();
			}
			else
			{
				System.out.println("You agr reeady for any work..");
			}
		}
		catch(OneException | TwoException ot)
		{
			System.out.println(ot.getMessage());
		}
	}

}
class OneException extends Exception
{
	public OneException()
	{
		super("Heloo..");
		
	}

}
class TwoException extends Exception
{
	public TwoException()
	{
		super("hii...");
	}
}
