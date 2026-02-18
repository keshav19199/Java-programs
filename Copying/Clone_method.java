package java_prog.Copying;

public class Clone_method {

	public static void main(String[] args) throws CloneNotSupportedException {

		One a=new One();
		
		a.id=12;
		
		One b=(One) a.Clone();
		
		System.err.println(b.id);
		
	}

}
class One implements Cloneable
{
	int id;
	
	public One()
	{
		this.id=id;
		
	}
	
	protected Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}

