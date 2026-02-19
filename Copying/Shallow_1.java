package java_prog.Copying;

public class Shallow_1 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Tiger t1=new Tiger();
		t1.id=1;
		t1.name="sheruu";
		
		Tiger t2=(Tiger)t1.Clone();
		t2.id=2;
		
		Tiger t3=(Tiger)t2.Clone();
		t3.id=3;
		t3.name="Simbha";
		
		
		Animal an=new Animal();
		an.A_name="Vaag";
		
		System.out.println(t1.id+"      "+t1.name+"     "+an.A_name);
		System.out.println(t2.id+"      "+t2.name+"     "+an.A_name);
		System.out.println(t3.id+"      "+t3.name+"     "+an.A_name);

	}

}
class Animal
{
	String A_name="Shera";
}
class Tiger implements Cloneable
{
	Animal A_name;
	String name;
	int id;
	
	public Tiger()
	{
		this.id=id;
		this.name=name;		
	}
	protected Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
