package java_prog.challeges.collection;

import java.util.Collection;

public class Utility {
	
	public static <E> void print(Collection<E> collection)
	{
		System.out.print("Collection: ");
		for(E coll:collection)
		{
			System.out.print(" "+coll);
		}
		System.out.println();
	}

	public static void main(String[] args) {

	}
}
