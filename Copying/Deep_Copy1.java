package java_prog.Copying;

public class Deep_Copy1 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Book b1=new Book();
		b1.price=539;
		b1.name="Amritvel";
		
		Book b2=(Book) b1.Clone();
		b2.name="panther";
		
		
		Author author=new Author();
		author.author_name="v.p. kale";
		
		System.out.println("Price: "+b1.price+" Book: "+b1.name+" Author: "+author.author_name);
		System.out.println("Price: "+b2.price+" Book: "+b2.name+" Author: "+author.author_name);
		
	}

}
class Author
{
	String author_name;	

}
class Book implements Cloneable
{
	Author author_name;
	int price;
	String name;
	
	public Book()
	{
		this.name=name;
		this.price=price;
	}
	
	protected Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
}
