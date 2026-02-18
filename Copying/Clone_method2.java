package java_prog.Copying;

public class Clone_method2 {

	public static void main(String[] args) throws Exception {

		Today t=new Today();
		Today s=(Today)t.Clone();
		
		System.out.println(t.Day);
		
	}

}
class Today implements Cloneable
{
	String Day="Wednesday";
	
	public Today()
	{
		this.Day=Day;
	}

	protected Object Clone() throws Exception
	{
		return super.clone();
	}
}