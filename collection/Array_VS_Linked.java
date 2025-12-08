package java_prog.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array_VS_Linked {

	public static void main(String[] args) {

		LinkedList<Book> books =new LinkedList<Book>();
		
	//	LinkedList<Book> books1=new LinkedList<Book>();
		
		
		for(int i=0; i<10000000; i++)
		{
			books.add((new Book (01, "abc",332.2,2.3)));
		}
		
		long Start_Time=System.nanoTime();
		System.out.println(books.remove(9));
		long End_Time=System.nanoTime();
		
		System.out.println("Time : "+(End_Time - Start_Time)/1000);
		
		
	}

}

class Book
{
	int id;
	String name;
	double price;
	double rating;
	
	public Book(int id, String name, double price, double rating)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.rating=rating;
	}
	

}
