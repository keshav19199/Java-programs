package java_prog.exceptions;

public class Exception1 {

	public static void main(String[] args) {

		String str="Sunday";
		String str2=str.toLowerCase();
		
		try {
			if(str.equals("Sunday")==false)
			{
				throw new NotSundayException();
			}
			System.out.println("Sunday.. Let's play a criket..");
			
		}
		catch(NotSundayException e){
			
			System.out.println(e.getMessage());
			
			
		}
		finally
		{
			System.out.println("...The End...");
			
		}
	}

}
class NotSundayException extends Exception
{
		public NotSundayException()
		{
			super("Hiii");
		}
}