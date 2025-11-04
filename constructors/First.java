package java_prog.constructors;

public class First {

	public static void main(String[] args) {

		Book book=new Book();
		//Book book=new Book(43.3); 	//Constructor call
		book.Book('3','4');
		book.Book(3.4);
		book.Book("d");
		
	}

}
class Book
{
	public Book()
	{
		System.out.println("Good morning...");
	}
	public void Book(double d)
	{
		System.out.println("it is double value");
	}
	public void Book(char a, char b)
	{
		System.out.println("it is character");
	}
	public void Book(String s)
	{
		System.out.println("It is a string");
	}
}
