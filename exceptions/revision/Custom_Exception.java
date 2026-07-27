package java_prog.exceptions.revision;

public class Custom_Exception {

	public static void main(String[] args) {

		int salary=5000;
		
		try {
			if(salary<=50000)
			{
				throw new SalaryException("Salry is Less than 50000");
			}
			System.out.println("Salary is Okay..");
		}
		catch(SalaryException se)
			{
				System.out.println(se.getMessage());
			}
		finally
			{
				System.out.println("The End..!");
			}
		}
}
class SalaryException extends Exception
{
	public SalaryException(String s)
	{
		super(s);
	}
	
}
