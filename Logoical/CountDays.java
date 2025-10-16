package java_prog.Logoical;

public class CountDays {

	public static void main(String[] args) {

		System.out.println(IBM.countdays(3,4));
	}

}
class IBM
{
	public static int countdays(int john,int peter)
	{
		int counter=0;
		if(peter<=john)
		{
			return -1;
		}
		int john_q=john*peter;
		int peter_q=0;
		
		while(john_q>=peter_q)
		{
			john_q+=john;
			peter_q+=peter;
			
			System.out.println("John Q:"+john_q);
			System.out.println("Peter P:"+peter_q);
			++counter;
			System.out.println("Days: "+counter);
			System.out.println();
		}
		return counter;
	}
}
