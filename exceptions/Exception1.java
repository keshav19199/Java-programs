package java_prog.exceptions;

public class Exception1 {

	public static void main(String[] args) {

		String str="Sunday";
		String str2=str.toLowerCase();
		
		try {
			if(str.equals("Sunday")==false)
			{
				throw new NoException();
			}
			System.out.println("Sunday.. Let's play a criket..");
			
		}
		catch(NoException e){
			
			System.out.println(e.getMessage());
			
			
		}
		finally
		{
			System.out.println("...The End...");
			
		}
	}

}
class NoException extends Exception
{
		public NoException()
		{
			super("Hiii");
		}
}