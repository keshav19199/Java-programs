package java_prog.exceptions.revision;

public class First {

	public static void main(String[] args) {

		try {
			System.out.println("Hii..");
			System.out.println(10/0);
			System.out.println("Hello..!");	// it is not execute because exception occur and jump the block and catch
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("The End..");			
		}
		System.out.println("All Code is Okay..");
	}

}
