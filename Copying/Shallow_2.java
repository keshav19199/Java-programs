package java_prog.Copying;

public class Shallow_2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Animall a1=new Animall("Shera",234.43);
		
		Animall a2=(Animall)a1.clone();
		a2.name="liger";
	
		System.out.println(a1.name+"  "+a1.weight);
		System.out.println(a2.name+"  "+a2.weight);
		
		// shallowing copy is you can chang second obj value. but you don't
		// chand it is by default assing 1st obj value.
		
		System.out.println(a1==a2);
	}
}
class Animall implements Cloneable
{
	String name;
	double weight;
	
	public Animall(String name, double weight)
	{
		this.name=name;
		this.weight=weight;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}