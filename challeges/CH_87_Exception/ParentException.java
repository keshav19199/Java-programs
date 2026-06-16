package java_prog.challeges.CH_87_Exception;

public class ParentException {

	public static void main(String[] args) {

		try {
			int a=3;
			int b=0;
			
			int div=a/b;
			
			System.out.println(div);
		}
		catch(Throwable e)
		{
			System.out.println("0 can't by divide any number");
		}
		finally {
			System.out.println("All DONE...!!");
		}
	}

}
