package java_prog.collection;

public class Generic1 {

	public static void main(String[] args) {
	
		Objectadder<String> add=new Objectadder<String>();
		add.add("QERTY", "ABCDE");
		
		System.out.println(add.getinstance("QWERTYUIOP"));
		
		
	}

}
interface Iadd<T>
{
	void add(T t1, T t2);
}

class Objectadder<T>implements Iadd<T>
{
	public void add(T t1,T t2)
	{
		if (t1 instanceof Integer && t2 instanceof Integer)
		{
			int i=(int)t1;
			int j=(int)t2;
			System.out.println(i+j);
		}
		else if(t1 instanceof String && t2 instanceof String)
		{
			String s1=(String)t1;
			String s2=(String)t2;
			System.out.println("String are found : "+s1+s2);
		}
	}
	public int getinstance(T t)
	{
		if (t instanceof String)
		{
			return((String) t).length();
		}
		return 0;
	}
}
