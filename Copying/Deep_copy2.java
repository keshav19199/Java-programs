package java_prog.Copying;

public class Deep_copy2 {

	public static void main(String[] args) throws CloneNotSupportedException{

		Room r=new Room("cat",2);
		
		Room r2=(Room)r.clone();
		r2.animal=4;
		
		Room r3=(Room)r2.clone();
		
		System.out.println(r.ani+"  "+r.animal);
		System.out.println(r2.ani+"  "+r2.animal);
		System.out.println(r3.ani+"  "+r3.animal);
		
		System.out.println("*********************");
		
		Person p1=new Person(4);
		
		Person p2=(Person)p1.clone();
		Person p3=(Person)p2.clone();
		p3.person=6;
		
		
		System.out.println(p1.person+"  "+p2.person+"  "+p3.person);
		
		
	}

}
class Room implements Cloneable
{
	String ani;
	int animal;
	
	Person p;

	public Room(String ani, int animal)
	{
		this.ani=ani;
		this.animal=animal;
		this.p=new Person(5);
	}
	
	public Object clone()throws CloneNotSupportedException
	{
		Room r4=(Room)super.clone();
		r4.p=(Person)this.p.clone();
		return r4;
	}
}


class Person implements Cloneable
{
	int person;
	
	public Person(int person)
	{
		this.person=person;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}