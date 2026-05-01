package java_prog.challeges;

public class CH_51_BookClass {

	public static void main(String[] args) {

		Book b1=new Book(1,"desing","Author");
		Book b2=new Book(2);
		System.out.println(Book.totalNoOfBooks);
		System.out.println(Book.getTotalNoBook());
		
		b1.borrowedBook();
		b2.borrowedBook();
		b1.borrowedBook();
		b1.returnBook();
		b1.returnBook();
		
		
		
	}

}
class Book
{
	static int totalNoOfBooks;
	boolean isBorrowed;
	
	static {
		totalNoOfBooks=0;
	}
	{
		totalNoOfBooks++;
	}
	
	int id;
	String title;
	String author;
	
	Book(int id, String title, String author)
	{
		this.id=id;
		this.title=title;
		this.author=author;
	}
	
	
	Book(int id)
	{
		this(id,"unknown","unkown");
	}
	
	static int getTotalNoBook()
	{
		return totalNoOfBooks;
	}
	
	void borrowedBook()
	{
		if(isBorrowed)
		{
			System.out.println("book is already borrowed");
		}
		else
		{
			this.isBorrowed=true;
			System.out.println("Enjoy the book "+this.title);
		}
		
	}
	
	void returnBook()
	{
		if(isBorrowed)
		{
			this.isBorrowed=false;
			System.out.println("Give the feedBack..");
		}
		else
		{
			System.out.println("this book is already in Library");
		}
	}
	
}
